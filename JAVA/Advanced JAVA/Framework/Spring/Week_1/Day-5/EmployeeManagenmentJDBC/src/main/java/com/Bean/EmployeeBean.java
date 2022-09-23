package com.Bean;

public class EmployeeBean {
    int id;
    String name,post,city;
    Float salary;




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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }
}
