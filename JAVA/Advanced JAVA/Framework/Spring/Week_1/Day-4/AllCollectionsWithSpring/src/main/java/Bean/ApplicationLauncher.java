package Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationLauncher {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        TeacherBean teacherBean = context.getBean("teacher",TeacherBean.class);
        System.out.println(teacherBean);
        System.out.println("\n");
        System.out.println("Using Display ");

        teacherBean.Display();
    }
}
