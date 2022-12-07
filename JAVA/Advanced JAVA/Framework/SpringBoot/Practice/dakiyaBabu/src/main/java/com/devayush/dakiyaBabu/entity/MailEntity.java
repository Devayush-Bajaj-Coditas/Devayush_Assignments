package com.devayush.dakiyaBabu.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MailEntity {

    ArrayList<String> toEmailId;
    String subject;
    String body;

}
