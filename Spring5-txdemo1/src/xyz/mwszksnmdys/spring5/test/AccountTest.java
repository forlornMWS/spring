package xyz.mwszksnmdys.spring5.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import xyz.mwszksnmdys.spring5.config.TxConfig;
import xyz.mwszksnmdys.spring5.dao.UserDaoImpl;
import xyz.mwszksnmdys.spring5.service.UserService;

/**
 * @className: AccountTest
 * @author: MWS
 * @date: 2022/9/20 上午9:25
 * @description: Todo
 */
public class AccountTest {
    @Test
    public void accountTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void accountTest2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void accountTest3(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
    // 函数式风格创建对象并交给Spring管理
    @Test
    public void accountTest4(){
        // 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        // 调用context方法注册对象
        context.refresh();
        context.registerBean("user1", UserService.class, UserService::new);
        // 获取在Spring注册的对象
//        UserService userService = (UserService) context.getBean("xyz.mwszksnmdys.spring5.service");
        UserService userService = (UserService) context.getBean("user1");
        System.out.println(userService);
    }
}
