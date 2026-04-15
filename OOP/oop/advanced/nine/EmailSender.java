package advanced.nine;

public class EmailSender extends MessageSender {
    String contents;
    public EmailSender(String mail, String senderName) {
        super(senderName);
        this.contents = mail;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email with" + message);
    }
}
