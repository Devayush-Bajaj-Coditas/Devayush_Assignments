import com.model.Laptop;
import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class AppLaunch {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Laptop laptop = new Laptop(101,"Asus");
        Laptop laptop1 = new Laptop(102,"Dell");
        Laptop laptop2 = new Laptop(103,"Hp");
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop1);
        laptops.add(laptop2);


        Student student = new Student(1,"Devayush",laptops);
        Transaction transaction = session.beginTransaction();
        session.save(laptop);
        session.save(laptop1);
        session.save(laptop2);
        session.save(student);
        laptop.setStudent(student);
        laptop1.setStudent(student);
        laptop2.setStudent(student);
        transaction.commit();

        //Fetching
        Transaction transaction1 = session.beginTransaction();
        Student studentFetch = session.get(Student.class,1);
        System.out.println(studentFetch);
        for(Laptop lap: studentFetch.getLaptopList()){
            System.out.println(lap.getLaptopName());
        }
        transaction.commit();
    }
}
