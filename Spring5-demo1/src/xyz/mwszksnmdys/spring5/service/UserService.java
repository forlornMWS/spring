package xyz.mwszksnmdys.spring5.service;

import xyz.mwszksnmdys.spring5.dao.UserDao;

/**
 * @className: UserService
 * @author: MWS
 * @date: 2022/9/16 下午3:44
 * @description: Todo
 */
public class UserService {
    // 创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add.....");
        userDao.update();
    }
}
