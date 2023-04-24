package pl.agntyp.zadanie22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender emailSender;

    private String appMail = "aga_test@op.pl";

    public void sendMessage(final Mail mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(appMail);
        message.setCc(mail.getAddress());
        message.setSubject(mail.getSubject());
        message.setText(mail.getMailContent());
        message.setReplyTo(mail.getAddress());
        message.setTo(appMail);

        emailSender.send(message);

    }
}
