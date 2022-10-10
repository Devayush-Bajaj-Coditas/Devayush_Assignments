import com.model.Marks;
import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ApplicationLauncher {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = new Student();
        student.setName("Devayush");

        Marks marks = new Marks();
        marks.setName("Dev");
        marks.setPhysics(78);
        marks.setChem(67);
        marks.setMaths(98);

        session.persist(student);
        session.persist(marks);
        transaction.commit();
        System.out.println("data inserted");
    }
}
