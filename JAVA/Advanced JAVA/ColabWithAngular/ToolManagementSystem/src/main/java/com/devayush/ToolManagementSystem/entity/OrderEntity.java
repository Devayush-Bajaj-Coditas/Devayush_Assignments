package com.devayush.ToolManagementSystem.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int orderId;

    @ManyToMany()
    List<ToolEntity> orderTools;    //multiple orders has multiple tools

    String orderCustomerName;

    @ManyToOne()
    WorkerEntity orderWorker;
    String OrderStatus;

}
