package rafademetrio.payroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafademetrio.payroll.model.Worker;
import rafademetrio.payroll.repository.WorkerRepository;

@Service
public class WorkerService {

    @Autowired
    WorkerRepository workerRepository;

    public Worker create(Worker worker){
        return this.workerRepository.save(worker);
    }

}
