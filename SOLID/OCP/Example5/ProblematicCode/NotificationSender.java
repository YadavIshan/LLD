package SOLID.OCP.Example5.ProblematicCode;
import java.util.List;

public class NotificationSender {
    public void sendNotification(List<NotificationType> notificationTypes, String message) {
        for (NotificationType notificationType : notificationTypes) {
            switch (notificationType) {
                case EMAIL -> notificationType.sendEmail(message);
                case SMS -> notificationType.sendSMS(message);
                case PUSH_NOTIFICATION -> notificationType.sendPushNotification(message);
            }
        }
    }

}