package SOLID.OCP.Example5.BetterCode;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using OCP compliant Notification Sender
        OCPNotificationSender sender = new OCPNotificationSender();

        List<NotificationService> services = new ArrayList<>();
        services.add(new EmailNotification());
        services.add(new SMSNotification());

        sender.sendAll(services, "Hello OCP!");

    }
}
