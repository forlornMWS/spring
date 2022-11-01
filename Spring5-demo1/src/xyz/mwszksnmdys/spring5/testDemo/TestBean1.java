import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.service.UserService;

/**
 * @className: TestBean1
 * @author: MWS
 * @date: 2022/9/16 下午4:00
 * @description: Todo
 */
public class TestBean1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
