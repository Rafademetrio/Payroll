package rafademetrio.payroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafademetrio.payroll.model.Worker;
import rafademetrio.payroll.repository.WorkerRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class WorkerService {

    @Autowired
    WorkerRepository workerRepository;

    public Worker create(Worker worker){
        if(workerRepository.existsByEmail(worker.getEmail())){
            throw new IllegalArgumentException("This email is already been used!");
        }
        return this.workerRepository.save(worker);
    }

    public  Worker findById(Long id){
        return workerRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Worker findByEmail(String email){
        return workerRepository.findByEmail(email).orElseThrow(NoSuchElementException::new);
    }

    public List<Worker> findAll(){
        return workerRepository.findAll();
    }

    public List<Worker> createAll(List<Worker> workers){
        return workerRepository.saveAll(workers);
    }


}
