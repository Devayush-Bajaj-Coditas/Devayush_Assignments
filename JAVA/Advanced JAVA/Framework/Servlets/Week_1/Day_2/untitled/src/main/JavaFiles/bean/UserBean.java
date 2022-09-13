package JavaFiles.bean;

public class UserBean {
    int id;
    String name,address;
    float salary;

    public UserBean(int id, String name, String address, float salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public UserBean(String name, String address, float salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
