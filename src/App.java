import com.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl ld=(UserDaoImpl)ac.getBean("userDaoImpl");
        System.out.println(ld.queryTitle());
    }
}
