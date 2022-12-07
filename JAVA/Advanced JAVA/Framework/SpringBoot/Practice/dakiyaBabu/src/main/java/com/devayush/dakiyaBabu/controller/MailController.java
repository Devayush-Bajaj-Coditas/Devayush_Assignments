package com.devayush.dakiyaBabu.controller;

import com.devayush.dakiyaBabu.entity.MailEntity;
import com.devayush.dakiyaBabu.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    EmailSenderService emailSenderService;

    @PostMapping("/sendEmail")
    public String sendEmail (@RequestBody MailEntity mailEntity){
        return emailSenderService.sendEmail(mailEntity);
    }
}
