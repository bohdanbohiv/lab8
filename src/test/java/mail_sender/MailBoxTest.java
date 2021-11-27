package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailBoxTest {
    MailBox mailBox;

    @BeforeEach
    void setUp() {
        Client client = new Client();
        client.setName("Jet Black");
        client.setAge(36);
        client.setSex(Gender.MALE);
        client.setEmail("black_dog@bebop.com");

        MailInfo mailInfo = new MailInfo();
        mailInfo.mailCode = MailCode.GREETINGS;
        mailInfo.client = client;

        mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
    }

    @Test
    void addMailInfo() {
        Client client = new Client();
        client.setName("Faye Valentine");
        client.setSex(Gender.FEMALE);
        client.setEmail("fayefaye@earth.com");

        MailInfo mailInfo = new MailInfo();
        mailInfo.mailCode = MailCode.HAPPY_BIRTHDAY;
        mailInfo.client = client;

        mailBox.addMailInfo(mailInfo);
        System.out.println("Two clients");
        mailBox.sendAll();
        System.out.println();
    }

    @Test
    void sendAll() {
        System.out.println("One client");
        mailBox.sendAll();
        System.out.println();
    }
}
