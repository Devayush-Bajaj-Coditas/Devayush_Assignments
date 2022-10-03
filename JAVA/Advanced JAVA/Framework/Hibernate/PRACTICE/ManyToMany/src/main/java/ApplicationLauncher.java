import com.model.Employee;
import com.model.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ApplicationLauncher {
    public static void main(String[] args) {
        Configuration configuration= new Configuration();
        configuration.configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session  = sessionFactory.openSession();

        Employee employee = new Employee(1,"devayush");
        Employee employee1 = new Employee(2,"adzy");
        Employee employee2 = new Employee(3, "Alia Bhatt");

        Projects projects1 = new Projects(2334, "Nespresso");
        Projects projects2 = new Projects(3445, "Hindustan Unilever");

        List <Employee> nespressoList = new ArrayList<>();
        nespressoList.add(employee);
        nespressoList.add(employee2);

        List <Employee> hindustanUnilever = new ArrayList<>();
        hindustanUnilever.add(employee1);
        hindustanUnilever.add(employee2);


        projects1.setEmployees(nespressoList);
        projects2.setEmployees(hindustanUnilever);

        Transaction transaction = session.beginTransaction();
        session.save(employee);
        session.save(employee1);
        session.save(employee2);
        session.save(projects1);
        session.save(projects2);
        transaction.commit();

    }
}