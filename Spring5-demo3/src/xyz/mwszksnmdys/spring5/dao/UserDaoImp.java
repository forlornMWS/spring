package xyz.mwszksnmdys.spring5.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @className: UserDaoImp
 * @author: MWS
 * @date: 2022/9/19 上午11:11
 * @description: Todo
 */
@Repository(value = "userDaoImp")
public class UserDaoImp implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add....");
    }
}
