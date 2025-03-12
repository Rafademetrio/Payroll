package rafademetrio.payroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafademetrio.payroll.model.Notification;
import rafademetrio.payroll.repository.NotificationRepository;

@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    public Notification create(Notification notification){
        return this.notificationRepository.save(notification);
    }
}
