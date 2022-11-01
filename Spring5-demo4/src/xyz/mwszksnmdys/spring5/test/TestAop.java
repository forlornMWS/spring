package xyz.mwszksnmdys.spring5.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.aopano.User;
import xyz.mwszksnmdys.spring5.aopxml.Book;

/**
 * @className: TestAop
 * @author: MWS
 * @date: 2022/9/19 下午3:30
 * @description: Todo
 */
public class TestAop {
    @Test
    public void testAop(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAop2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
