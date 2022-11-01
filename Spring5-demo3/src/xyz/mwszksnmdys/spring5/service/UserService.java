package xyz.mwszksnmdys.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import xyz.mwszksnmdys.spring5.dao.UserDao;

import javax.annotation.Resource;

/**
 * @className: UserService
 * @author: MWS
 * @date: 2022/9/19 上午10:56
 * @description: Todo
 */
@Component(value = "userService") // value值不写的话默认为类名首字母小写。
public class UserService {
//    @Autowired // 根据类型进行注入
//    @Qualifier(value = "userDaoImp")  // 根据名称注入，需与@Autowired一起使用
//    private UserDao userDao;
//    @Resource // 根据类型进行注入
    @Resource(name = "userDaoImp") // 根据名称进行注入
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("Adding a new user.");
        System.out.println(name);
        userDao.add();
    }
}
