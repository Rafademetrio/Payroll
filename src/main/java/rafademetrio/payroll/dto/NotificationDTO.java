package rafademetrio.payroll.dto;

import rafademetrio.payroll.model.Notification;

public class NotificationDTO {
    private String text;

    public NotificationDTO() {}

    public NotificationDTO(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Notification toModel() {
        return new Notification(null, this.text);
    }
}
