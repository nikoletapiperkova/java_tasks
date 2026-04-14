package advanced.nine;

public class PushNotificationSender extends MessageSender{
    String notification;
    public PushNotificationSender(String notification, String senderName) {
        super(senderName);
        this.notification = notification;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending notification with" + message);
    }
}
