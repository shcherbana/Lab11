package org.example.task2;

import com.mailjet.client.errors.MailjetException;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInformation) {
        infos.add(mailInformation);
    }

    public void sendAll() throws MailjetException {
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo : infos) {
            mailSender.sendMail(mailInfo);
        }
    }
}