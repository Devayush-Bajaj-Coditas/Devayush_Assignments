import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class ApplicationLauncher {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("SpringBean");
        ParticipantsBean participantsBean = (ParticipantsBean)context.getBean("p1");

        System.out.println("DID Seasonname::" + new DID().getSeasonName());
        List<String> l = new DID().getBrandPartners();
        System.out.println("Brand Partners::");
        for(String v : l){
            System.out.println(v);
        }
        Map<ParticipantsBean,String> m = new DID().getParticipants();
        for(Map.Entry<ParticipantsBean,String> p1:m.entrySet()){
            for (Map.Entry<new DID());
        }
    }
}
