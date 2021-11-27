package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    MailInfo mailInfo;

    @BeforeEach
    void setUp() {
        Client client = new Client();
        client.setName("Edward");
        client.setSex(Gender.FEMALE);

        mailInfo = new MailInfo();
        mailInfo.mailCode = MailCode.GREETINGS;
        mailInfo.client = client;
    }

    @Test
    void getText() {
        assertEquals("Greetings Edward!\n", mailInfo.getText());
    }
}