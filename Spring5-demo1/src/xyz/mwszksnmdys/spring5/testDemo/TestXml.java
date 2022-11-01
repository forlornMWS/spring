import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.Book;
import xyz.mwszksnmdys.spring5.Orders;
import xyz.mwszksnmdys.spring5.User;

/**
 * @className: TestXml
 * @author: MWS
 * @date: 2022/9/16 下午2:46
 * @description: 基于xml创建对象时默认使用无参构造方法
 */
public class TestXml {
    public static void main(String [] args) {
// 加载Spring配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean1.xml");
// 获取配置创建的对象
        User user = applicationContext.getBean("user", User.class);
        user.add();

        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();

        Orders orders = applicationContext.getBean("orders", Orders.class);
        orders.ordersTest();
    }
}
