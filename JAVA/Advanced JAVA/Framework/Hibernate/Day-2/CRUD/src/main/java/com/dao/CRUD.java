package com.dao;


import org.hibernate.cfg.Configuration;

public interface CRUD {
    Configuration configuration= new Configuration().configure("Employee.cfg.xml");

}
