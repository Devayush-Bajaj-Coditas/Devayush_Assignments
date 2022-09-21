package Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationLauncher {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        DirectorBean directorBean = context.getBean("director", DirectorBean.class);
        directorBean.display();
    }
}


/*          OUTPUT
    Thrill
    Horror
    Comedy
    Adventure
    MovieBean{movieName='RRR', movieYear=2022}=Mohit suri
    MovieBean{movieName='World War Z', movieYear=2017}=RajaRamMohli

*/
