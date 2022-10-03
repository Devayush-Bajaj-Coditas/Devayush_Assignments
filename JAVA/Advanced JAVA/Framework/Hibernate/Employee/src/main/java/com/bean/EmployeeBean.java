package com.bean;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class EmployeeBean {
    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    //auto increment
    @Column(name = "employeeId")
    private int id;
    @Column(columnDefinition = "varchar(50) default 'noname'")
    private String name;
    @Column()
    private String address;

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
