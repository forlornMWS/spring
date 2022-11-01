package xyz.mwszksnmdys.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.mwszksnmdys.spring5.dao.UserDao;

/**
 * @className: UserService
 * @author: MWS
 * @date: 2022/9/20 上午9:15
 * @description: Todo
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class UserService {
    // 注入dao
    @Autowired
    private UserDao userDao;
    // 转账方法
    public void accountMoney(){
//        try{
            // 开启事务

            // 事务操作
            userDao.reduceMoney();
            // 模拟异常
//            int i = 10 / 0;
            userDao.addMoney();
            // 提交事务
//        }catch (Exception e){
//            // 事务回滚
//        }
    }
}
