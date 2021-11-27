package mail_sender;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailCodeTest {

    @Test
    void generateText() {
        assertEquals("Greetings %NAME%!\n", MailCode.GREETINGS.generateText());
        assertEquals("Hello %NAME%\nHappy birthday\n", MailCode.HAPPY_BIRTHDAY.generateText());
    }
}
