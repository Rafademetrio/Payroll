package rafademetrio.payroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafademetrio.payroll.model.Notification;
import rafademetrio.payroll.repository.NotificationRepository;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    public List<Notification> createAll(List<Notification> notifications) {
        return this.notificationRepository.saveAll(notifications);
    }

    public Notification create(Notification notification){
        return this.notificationRepository.save(notification);
    }

    public List<Notification> findAll() {
        return this.notificationRepository.findAll();
    }
}
