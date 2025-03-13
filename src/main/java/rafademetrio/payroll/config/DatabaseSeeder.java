package rafademetrio.payroll.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rafademetrio.payroll.model.Notification;
import rafademetrio.payroll.model.Worker;
import rafademetrio.payroll.service.NotificationService;
import rafademetrio.payroll.service.WorkerService;

import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private WorkerService workerService;

    @Autowired
    private NotificationService notificationService;

    @Override
    public void run(String... args) throws Exception {
        workerService.createAll(List.of(
                new Worker((Long) null,"Rafael","rafael@gmail.com","123",12.5f,null),
                new Worker((Long) null,"Rodrigo","rodrigo@gmail.com","123",32.5f,null),
                new Worker((Long) null,"Clara","clara@gmail.com","123",22.5f,null)
                ));

        notificationService.createAll(List.of(
                new Notification(null, "niver de fulano"),
                new Notification(null, "feriado"),
                new Notification(null, "reunião às 14hrs")
        ));


    }
}
