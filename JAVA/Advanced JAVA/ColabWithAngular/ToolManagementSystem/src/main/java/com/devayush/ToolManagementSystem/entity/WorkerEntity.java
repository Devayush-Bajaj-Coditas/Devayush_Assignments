package com.devayush.ToolManagementSystem.entity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int workerId;
    String workerName;
    String workerUsername;
    String workerPassword;
    float workerSalary;


    @OneToMany(mappedBy = "orderWorker")
    List<OrderEntity> orders;


}
