package rafademetrio.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafademetrio.payroll.model.Worker;

import java.util.Optional;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    boolean existsByEmail(String email);

    Optional<Worker> findByEmail(String email);
}
