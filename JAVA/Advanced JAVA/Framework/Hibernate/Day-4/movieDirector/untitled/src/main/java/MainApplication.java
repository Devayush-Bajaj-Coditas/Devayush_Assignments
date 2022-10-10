import model.Director;
import model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.management.MalformedObjectNameException;
import java.util.HashSet;
import java.util.Set;

public class MainApplication {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        Director director = new Director(1,"abc");

        Movie movie = new Movie(1,"De dhana dan");
        Movie movie1 = new Movie(2,"golmaal");

        Set<Movie> movies = new HashSet<Movie>();
        movies.add(movie);
        movies.add(movie1);


        //director.setMovies();


    }
}
