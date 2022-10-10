package com.StudentApi.StudentApi.model;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class ContactNumber {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    int contactNumber;


}
