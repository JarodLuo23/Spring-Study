import com.jarod.pojo.people;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        people people = context.getBean("people", people.class);
        people.getDog().shout();
        people.getCat().shout();
    }
}
