package SOLID.OCP.Example5.ProblematicCode;

public enum NotificationType {
    EMAIL,
    SMS,
    PUSH_NOTIFICATION;

    public void sendEmail(String message) {
        System.out.println("Sending Email: " + message);
    }

    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }

    public void sendPushNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
