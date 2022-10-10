import com.model.Players;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        System.out.println("Enter number of teams");

        for(int i = 0; i <count; i++){
            Transaction transaction = session.beginTransaction();
            System.out.println("Enter team member and owner name");
            String teamName = bufferedReader.readLine();
            String ownerName = bufferedReader.readLine();

            System.out.println("How many players you want to add ");
            int pcount = bufferedReader.read();

            Map<String,Players> pmao = new HashMap<String,Players>();
            for (int j = 0; j < count ; j++){
                System.out.println("Enter jno, name and bid value o player and ContaryName ==> ");
                int jno = Integer.parseInt(bufferedReader.readLine());
                String name = bufferedReader.readLine();
                int bid = Integer.parseInt(bufferedReader.readLine());
                Players players = new Players(jno,name,bid);


                String country = bufferedReader.readLine();


            }
        }
    }
}
