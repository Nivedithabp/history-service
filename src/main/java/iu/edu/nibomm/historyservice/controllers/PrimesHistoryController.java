package iu.edu.nibomm.historyservice.controllers;

import iu.edu.nibomm.historyservice.model.PrimesRecord;
import iu.edu.nibomm.historyservice.repository.PrimesHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {


    private final PrimesHistoryRepository primesHistoryRepository;
    public PrimesHistoryController(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }
    @GetMapping("/{customer}")
    public List<PrimesRecord> findall(@PathVariable String customer){
        return primesHistoryRepository.findAllByCustomer(customer);
    }

}
