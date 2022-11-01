package xyz.mwszksnmdys.spring5.testdemo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.config.SpringConfig;
import xyz.mwszksnmdys.spring5.service.UserService;

/**
 * @className: TestSpring5demo1
 * @author: MWS
 * @date: 2022/9/16 下午4:55
 * @description: Todo
 */
public class TestSpring5demo1 {
    @Test
    public void testService(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testService2(){
        // 加载配置类
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
