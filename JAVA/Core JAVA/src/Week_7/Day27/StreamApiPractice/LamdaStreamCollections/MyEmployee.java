package Week_7.Day27.StreamApiPractice.LamdaStreamCollections;

import Week_4.Day17.employee_SerializationAndDeserialization.Employee;

public class MyEmployee {
    int id;
    String name;
    float salary;

    MyEmployee(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
