package Bean;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class TeacherBean {
    private String name;
    private int id;


    private AddressBean Address;
    private Set<String> subjects;
    private Map <StudentBean, String> students;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressBean getAddress() {
        return Address;
    }

    @Autowired
    public void setAddress(AddressBean address) {
        Address = address;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Map<StudentBean, String> getStudents() {
        return students;
    }

    public void setStudents(Map<StudentBean, String> students) {
        this.students = students;
    }

    public TeacherBean(String name, int id, AddressBean address, Set<String> subjects, Map<StudentBean, String> students) {
        this.name = name;
        this.id = id;
        Address = address;
        this.subjects = subjects;
        this.students = students;
    }
    public  TeacherBean(){}

    @Override
    public String toString() {
        return "TeacherBean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Address=" + Address +
                ", subjects=" + subjects +
                ", students=" + students +
                '}';
    }
    void Display(){
        System.out.println("Teacher Name = " + name + "\n Teacher Id" + id);
        System.out.println("Address = "+ getAddress());
        System.out.println("Subject list: ");
        for (String s : subjects){
            System.out.println(s);
        }
        System.out.println("Student List: ");

        for (Map.Entry<StudentBean, String> iterator: students.entrySet()){
            System.out.println(iterator.getKey());
            System.out.println(iterator.getValue());
        }






    }
}
