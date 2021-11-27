package mail_sender;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Receiver: " + mailInfo.client.getEmail());
        System.out.println("Contents: " + mailInfo.getText());
    }
}
