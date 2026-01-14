package SOLID.OCP.Example5.BetterCode;

import java.util.List;

public class OCPNotificationSender {
    public void sendAll(List<NotificationService> services, String message) {
        for (NotificationService service : services) {
            service.sendNotification(message);
        }
    }
}
