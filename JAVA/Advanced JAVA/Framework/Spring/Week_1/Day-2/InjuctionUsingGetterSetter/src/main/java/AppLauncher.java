import com.pojo.AddressPojo;
import com.pojo.StudentPojo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLauncher {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        AddressPojo addressPojo =(AddressPojo) context.getBean("address");
        StudentPojo studentPojo = (StudentPojo) context.getBean("student");
        System.out.println(addressPojo);
        System.out.println(studentPojo);
    }
}
