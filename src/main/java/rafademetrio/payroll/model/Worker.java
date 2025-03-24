package rafademetrio.payroll.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    private float hourlyRate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "worker_notification",
            joinColumns = @JoinColumn(name = "woker_id"),
            inverseJoinColumns = @JoinColumn(name = "notification_id")
    )
    private List<Notification> notifications;


    public Worker() {
    }

    public Worker(Long id,String name, String email, String password, float hourlyRate, List<Notification> notifications) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.hourlyRate = hourlyRate;
        this.notifications = notifications;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public float calculateSalary(float hoursWorked) {
        return this.hourlyRate * hoursWorked;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
