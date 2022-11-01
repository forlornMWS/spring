package xyz.mwszksnmdys.spring5.testdemo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.autowire.Emp;
import xyz.mwszksnmdys.spring5.bean.Orders;
import xyz.mwszksnmdys.spring5.collectionType.Book;
import xyz.mwszksnmdys.spring5.collectionType.Course;
import xyz.mwszksnmdys.spring5.factorybean.MyBean;

/**
 * @className: TestSpring5demo1
 * @author: MWS
 * @date: 2022/9/16 下午4:55
 * @description: Todo
 */
public class TestSpring5demo2 {
    @Test
    public void testCollection() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);  // 输出地址相同，则为单实例对象（默认情况下）；输出地址不同则为多实例对象
        System.out.println(book2);
    }

    @Test
    public void test3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步，创建对象实例");
        System.out.println(orders);
        ((ClassPathXmlApplicationContext)context).close();
    }
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
