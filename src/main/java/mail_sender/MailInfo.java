package mail_sender;

import java.util.HashMap;

public class MailInfo {
    Client client;
    MailCode mailCode;

    public String getText() {
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());

        String text = mailCode.generateText();
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }
}
