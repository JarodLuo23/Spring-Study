import com.jarod.pojo.User;
import com.jarod.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) context.getBean("user2");
//        user.show();

        //别名测试
        UserT user = (UserT) context.getBean("u5");
        user.show();
    }
}
