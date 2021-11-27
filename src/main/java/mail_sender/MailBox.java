package mail_sender;

import java.util.LinkedList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos = new LinkedList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        MailSender mailSender = new MailSender();
        for (MailInfo info: infos) {
            mailSender.sendMail(info);
        }
    }
}
