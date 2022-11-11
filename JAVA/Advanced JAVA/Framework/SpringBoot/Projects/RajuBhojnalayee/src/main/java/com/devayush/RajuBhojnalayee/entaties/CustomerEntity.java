package com.devayush.RajuBhojnalayee.entaties;

import javax.persistence.*;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    private String customerName;
    private long phoneNumber;




}
