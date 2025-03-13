package rafademetrio.payroll.dto;

import rafademetrio.payroll.model.Notification;
import rafademetrio.payroll.model.Worker;

import java.util.List;


    public class WorkerOutputDTO {
        private Long id;
        private String name;
        private String email;
        private float hourlyRate;
        private List<Notification> notifications;


        public WorkerOutputDTO() {
        }

        public WorkerOutputDTO(Long id,String name, String email, String password, float hourlyRate, List<Notification> notifications) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.hourlyRate = hourlyRate;
            this.notifications = notifications;
        }

        public WorkerOutputDTO(Worker worker) {
            this.id = worker.getId();
            this.name = worker.getName();
            this.email = worker.getEmail();
            this.hourlyRate = worker.getHourlyRate();
            this.notifications = worker.getNotifications();
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

        public float getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate(float hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        public List<Notification> getNotifications() {
            return notifications;
        }

        public void setNotifications(List<Notification> notifications) {
            this.notifications = notifications;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

