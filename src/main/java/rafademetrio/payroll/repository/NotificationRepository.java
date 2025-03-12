package rafademetrio.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rafademetrio.payroll.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
