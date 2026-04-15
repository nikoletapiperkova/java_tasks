package advanced.nine;

public abstract class MessageSender {
    protected String senderName;
    public MessageSender(String senderName) {
        this.senderName = senderName;
    }
    public abstract void sendMessage(String recipient, String message);
}
