package ZCoreJava.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeToStudent {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Usman");
        Employee employee2 = new Employee(2, "Zulfa");
        Employee employee3 = new Employee(3, "Devayush");
        Employee employee4 = new Employee(4, "Anuj");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        List<Student> studentList = employeeList.stream().map(stu -> new Student(stu.getEmployeeId(), stu.getEmployeeName())).collect(Collectors.toList());
        studentList.forEach(System.out::println);


    }
}