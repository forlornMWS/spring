package xyz.mwszksnmdys.spring5.testdemo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.collectionType.Book;
import xyz.mwszksnmdys.spring5.collectionType.Stu;

/**
 * @className: TestSpring5demo1
 * @author: MWS
 * @date: 2022/9/16 下午4:55
 * @description: Todo
 */
public class TestSpring5demo1 {
    @Test
    public void testCollection(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
}
