import com.bean.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Embeddable;
import javax.persistence.Query;
import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ApplicationLauncher {
    public static void main(String[] args) {
        Employee employee = new Employee();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press \n 1--> Insert \n2-->Fetch\n3--> get total number of records");
        //c
        Configuration configuration = new Configuration().configure("employee.cfg.xml");
        //s
        Session session = configuration.buildSessionFactory().openSession();
        //t
        Transaction transaction = session.beginTransaction();

        try {
            int choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = bufferedReader.readLine();

                    System.out.println("Enter Designation: ");
                    String Designation = bufferedReader.readLine();

                    System.out.println("Enter Salary");
                    String salary = bufferedReader.readLine();

                    System.out.println("Enter city");
                    String city = bufferedReader.readLine();

                    System.out.println("Enter new city");
                    String newCity = bufferedReader.readLine();



                    employee.setCity(city);
                    employee.setEmpDesig(Designation);
                    employee.setEmpName(name);
                    employee.setEmpSalary(salary);
                    employee.setNewcity(newCity);

                    int status = (int) session.save(employee);

                    if (status > 0) {
                        transaction.commit();
                        System.out.println("Registration success");
                    } else
                        System.out.println("Something went wrong");
                    break;

                case 2:
                    System.out.println("Fetch data from Id : ");
                    int id = Integer.parseInt(bufferedReader.readLine());
                    Employee employee1 = session.get(Employee.class, id);
                    transaction.commit();
                    System.out.println(employee1);
                    break;

                case 3:
                    //PRINT TOTAL NUMBER OF RECORDS
                    Query query = session.createQuery("select count (*) from employee2");
                    Iterator count = query.getParameters().iterator();
                    System.out.println("No of rows "+ count.next());

                case 4:
                    //select users of same city
                    System.out.println("Enter city name : ");
                   // String city = bufferedReader.readLine();
                    Query query1 = session.createQuery("select * from employee where city x");
            }
            }catch(Exception e){
                e.printStackTrace();

        }
    }
}
