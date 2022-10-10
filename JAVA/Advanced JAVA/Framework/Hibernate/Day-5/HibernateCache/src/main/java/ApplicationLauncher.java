import com.model.User1;
import com.model.User2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;

public class ApplicationLauncher {
    public static void main(String[] args) {
        User1 user1 = new User1(12,"Devayush");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //add and fetch data from 1st session
        session.save(user1);
        transaction.commit();
        //close 11st session

        session.close();
        //fetch the same data using second session
        Session session2 = sessionFactory.openSession();
        User1 user3 = session2.load(User1.class,12);
        System.out.println(user3.getId());


    }
}
