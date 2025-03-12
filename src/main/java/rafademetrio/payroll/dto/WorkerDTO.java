package rafademetrio.payroll.dto;

import rafademetrio.payroll.model.Notification;
import rafademetrio.payroll.model.Worker;

import java.util.Collections;
import java.util.List;

public class WorkerDTO {
    private String name;
    private String email;
    private String password;
    private float hourlyRate;
    private List<NotificationDTO> notifications;
    //private List<Notification> notifications;

    public Worker toModel() {
        //List<Notification> notificationList = Collections.singletonList(notifications.listIterator().next().toModel());
        return new Worker(null, this.name, this.email,this.password, this.hourlyRate, null);

        //ajustar o notificationList
    }

    public WorkerDTO() {
    }

    public WorkerDTO(String name, String email, String password, float hourlyRate, List<NotificationDTO> notifications) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.hourlyRate = hourlyRate;
        this.notifications = notifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public List<NotificationDTO> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<NotificationDTO> notifications) {
        this.notifications = notifications;
    }
}
