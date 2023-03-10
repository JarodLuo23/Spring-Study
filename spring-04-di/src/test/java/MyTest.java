import com.jarod.pojo.Student;
import com.jarod.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());
    }

    @Test
        public void test2(){
            ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");

            User user = context.getBean("users",User.class);

            System.out.println(user);
        }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user.toString());
    }

}
