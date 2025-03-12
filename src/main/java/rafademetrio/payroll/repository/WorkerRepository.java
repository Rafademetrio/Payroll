package rafademetrio.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafademetrio.payroll.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
