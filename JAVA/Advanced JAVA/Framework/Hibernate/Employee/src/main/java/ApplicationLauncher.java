import com.bean.EmployeeBean;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ApplicationLauncher {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            EmployeeBean employeeBean = new EmployeeBean();


            System.out.println("Enter name: ");
            String name = bufferedReader.readLine();
            System.out.println("Enter address");
            String address = bufferedReader.readLine();
            System.out.println("Enter ID");
            int Id = Integer.parseInt(bufferedReader.readLine());

            Configuration configuration = new Configuration().configure("employee.cfg.xml");
            Session session = configuration.buildSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            employeeBean.setAddress(address);
            employeeBean.setName(name);
            int status = (int) session.save(employeeBean);


            if (status > 0) {
                transaction.commit();
                System.out.println("Registration successful");
            }
            else
                System.out.println("Something went wrong");
        }
        catch (Exception e ) {
            e.printStackTrace();
        }
        }
    }
