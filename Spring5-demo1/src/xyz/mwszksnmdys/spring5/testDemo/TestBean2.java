import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.bean.Emp;
import xyz.mwszksnmdys.spring5.service.UserService;

/**
 * @className: TestBean1
 * @author: MWS
 * @date: 2022/9/16 下午4:00
 * @description: Todo
 */
public class TestBean2 {
    public static void main(String[] args) {
        // 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        // 获取配置创建的对象
        Emp userService = context.getBean("emp", Emp.class);
        userService.test();
    }
}
