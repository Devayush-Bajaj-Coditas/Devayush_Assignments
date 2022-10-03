import com.dao.EmpDao;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainApplication {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        EmpDao empDao = new EmpDao();
        int choice = 0;
        do {
            System.out.println("1--> create\n2-->Read\n3-->Update\n4-->Delete ");
            try {

                choice = Integer.parseInt(bufferedReader.readLine());

                switch (choice) {
                    case 1:
                        empDao.create();
                        break;
                    case 2:
                        empDao.fetchById();
                    case 3:
                        empDao.update();
                    case 6:
                        //fetch by restriction
                        empDao.fetchByRestriction("devayush");

                    case 7:
                        empDao.fetchByOrder("asc","name");

                    case 8:
                        empDao.fetchByProjection("name");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (choice != 0);
        }
}
