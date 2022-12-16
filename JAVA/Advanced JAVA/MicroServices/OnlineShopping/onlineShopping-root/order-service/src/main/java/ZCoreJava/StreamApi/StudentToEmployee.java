package ZCoreJava.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class StudentToEmployee {
    public static void main(String[] args) {
        Student student1 = new Student(1, "usman");
        Student student2 = new Student(2, "jaish");
        Student student3 = new Student(3, "anuj");
        Student student4 = new Student(4, "zulfa");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);


        studentList.stream().filter(student -> student.getStudentId()%2 ==0).map(student -> new Employee(student.getStudentId(), student.getStudentName())).forEach(System.out::println);

    }
}