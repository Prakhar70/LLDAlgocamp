package Solid.Example4.BetterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<String> notificationTypes, String message) {
        for (String notificationType : notificationTypes) {
            switch (notificationType) {
                case "SMS":
                    SMSNotification notification = new SMSNotification();
                    notification.sendSMSNotification(message);
                    break;
                case "EMAIL":
                    EmailNotification smsNotification = new EmailNotification();
                    smsNotification.sendEmailNotification(message);
                    break;
                case "PUSH":
                    PushNotification pushNotification = new PushNotification();
                    pushNotification.sendPushNotification(message);
                    break;
            }
        }
    }

}