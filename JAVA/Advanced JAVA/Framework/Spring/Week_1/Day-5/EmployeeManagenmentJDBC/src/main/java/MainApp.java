import com.Bean.EmployeeBean;
import com.Dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        EmployeeDao employeeDao = applicationContext.getBean("empDao",EmployeeDao.class);

        EmployeeBean employeeBean = new EmployeeBean();
        employeeBean.setId(12);
        employeeBean.setName("ll");
        employeeBean.setPost("eng");
        employeeBean.setCity("Pune");
        employeeBean.setSalary(234500f);

        employeeDao.registerEmployee(employeeBean);
    }
}
