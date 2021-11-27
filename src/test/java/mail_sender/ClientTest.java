package mail_sender;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client1;
    Client client2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client1 = new Client();
        client2 = new Client();
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals(0, client1.getId());
        assertEquals(1, client2.getId());
    }
}