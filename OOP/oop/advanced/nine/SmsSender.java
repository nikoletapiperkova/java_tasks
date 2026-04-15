package advanced.nine;

public class SmsSender extends MessageSender {
    String sms;
    public SmsSender(String sms, String senderName) {
        super(senderName);
        this.sms = sms;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending sms with" + message);
    }
}
