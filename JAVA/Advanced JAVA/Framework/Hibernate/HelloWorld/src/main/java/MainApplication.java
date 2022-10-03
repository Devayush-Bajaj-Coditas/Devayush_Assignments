import com.bean.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Book name : " );
        String bookName = bufferedReader.readLine();
        System.out.println("author name: ");
        String authorName = bufferedReader.readLine();
        System.out.println("price: "  );
        float price = Float.parseFloat(bufferedReader.readLine());
        System.out.println("Book ID");
        int bookId = Integer.parseInt(bufferedReader.readLine());

        Book book = new Book();
        book.setPrice(price);
        book.setBookName(bookName);
        book.setBookId(bookId);
        book.setAuthorName(authorName);

        Configuration configuration = new Configuration().configure("Configuration.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        int insert = (int) session.save(book);

        if (insert>0){
            transaction.commit();
            System.out.println("inserted successful");
        }
        else{
            System.out.println("Something went wrong");
        }

    }
}
