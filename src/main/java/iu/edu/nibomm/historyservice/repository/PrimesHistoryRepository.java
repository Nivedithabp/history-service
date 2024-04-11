package iu.edu.nibomm.historyservice.repository;

import iu.edu.nibomm.historyservice.model.PrimesRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimesHistoryRepository extends CrudRepository<PrimesRecord,Integer> {
    List<PrimesRecord> findAllByCustomer(String customer);

}
