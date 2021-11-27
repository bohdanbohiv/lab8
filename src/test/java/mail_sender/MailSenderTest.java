package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailSenderTest {
    MailInfo mailInfo;

    @BeforeEach
    void setUp() {
        Client client = new Client();
        client.setName("Spike Spiegel");

        client.setAge(27);
        client.setSex(Gender.MALE);
        client.setEmail("cowboy_bebop@mars.com");

        mailInfo = new MailInfo();
        mailInfo.mailCode = MailCode.GREETINGS;
        mailInfo.client = client;
    }

    @Test
    void sendMail() {
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}