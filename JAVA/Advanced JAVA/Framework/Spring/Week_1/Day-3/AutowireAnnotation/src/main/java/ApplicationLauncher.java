import com.bean.StudentBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class ApplicationLauncher {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SptingBean.xml");
        StudentBean studentBean = (StudentBean) context.getBean("student");
        System.out.println(studentBean);

    }
}
