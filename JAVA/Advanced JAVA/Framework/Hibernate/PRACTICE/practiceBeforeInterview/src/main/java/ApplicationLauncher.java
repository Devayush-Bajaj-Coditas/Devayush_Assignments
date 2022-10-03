import com.model.Answers;
import com.model.Questions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ApplicationLauncher {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Spring.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Questions questions = new Questions();

        questions.setQuestion("What is your pet's name");
        questions.setQuestionId(1);

        Answers answers = new Answers();
        answers.setAnswerId(1);
        answers.setAnswer("chujju");

        Answers answers2 = new Answers();
        answers2.setAnswerId(2);
        answers2.setAnswer("Munni");


        Answers answers3 = new Answers();
        answers3.setAnswerId(3);
        answers3.setAnswer("chulbul");


        List <Answers> answerList= new ArrayList<>();
        answerList.add(answers);
        answerList.add(answers2);
        answerList.add(answers3);
        questions.setAnswers(answerList);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(answers);


    }
}
