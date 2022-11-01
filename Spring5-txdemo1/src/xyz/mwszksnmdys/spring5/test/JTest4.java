package xyz.mwszksnmdys.spring5.test;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import xyz.mwszksnmdys.spring5.service.UserService;

/**
 * @className: JTest4
 * @author: MWS
 * @date: 2022/9/20 下午1:55
 * @description: Todo
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        System.out.println(userService);
    }
}
