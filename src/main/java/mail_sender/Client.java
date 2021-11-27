package mail_sender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private final int id;
    private String name;
    private int age;
    private Gender sex;
    private static int counter = 0;
    private String email;

    public Client() {
        id = counter;
        counter++;
    }
}
