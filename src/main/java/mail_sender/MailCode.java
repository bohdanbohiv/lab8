package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        File file = new File(filename);
        StringBuilder str = new StringBuilder();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                str.append(sc.nextLine()).append("\n");
            }
        } catch(FileNotFoundException ignored) {}
        return str.toString();
    }
}
