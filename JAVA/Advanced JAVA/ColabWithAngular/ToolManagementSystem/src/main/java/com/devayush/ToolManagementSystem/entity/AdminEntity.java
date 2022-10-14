package com.devayush.ToolManagementSystem.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class AdminEntity {
    @Id
    int aminId;
    String adminName;
    String adminUserName;
    String adminPassword;
    String adminRole;

}
