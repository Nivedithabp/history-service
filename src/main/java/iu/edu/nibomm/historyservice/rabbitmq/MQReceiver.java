package iu.edu.nibomm.historyservice.rabbitmq;

import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import iu.edu.nibomm.historyservice.model.PrimesRecord;
import iu.edu.nibomm.historyservice.repository.PrimesHistoryRepository;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.Map;

@Component
public class MQReceiver {

    private final PrimesHistoryRepository primesHistoryRepository;

    public MQReceiver(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }

    @RabbitListener(queues = {"primes"})
    public void receiveMessage(@Payload String message) {
        System.out.println(message);
        Gson gson = new Gson();
        PrimesRecord primesRecord = gson.fromJson(message, PrimesRecord.class);
        // Save the PrimesRecord object to the repository
        primesHistoryRepository.save(primesRecord);
    }

}
