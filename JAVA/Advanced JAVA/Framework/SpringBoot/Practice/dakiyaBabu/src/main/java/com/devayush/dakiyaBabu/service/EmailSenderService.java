package com.devayush.dakiyaBabu.service;

import com.devayush.dakiyaBabu.entity.MailEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;
    String msg;

    public String sendEmail(MailEntity mailEntity) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("devayushbajaj@gmail.com");
        mailEntity.getToEmailId().stream().forEach(mail -> message.setTo(mail));
        message.setTo(mailEntity.getToEmailId().get(0), mailEntity.getToEmailId().get(1), mailEntity.getToEmailId().get(2));
        message.setSubject(mailEntity.getSubject());
        message.setText(mailEntity.getBody());
        javaMailSender.send(message);
        msg = "Mail send" + mailEntity.getToEmailId().listIterator().next() + "\n";
        return msg;
    }
}