import model.MyUser;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ApplicationLauncher {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Devayush");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        MyUser myUser = new MyUser(1,"Devayush");
        entityManager.persist(myUser);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
        entityManager.close();

    }
}
