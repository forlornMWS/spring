package xyz.mwszksnmdys.spring5.aopano;

import org.springframework.stereotype.Component;

/**
 * @className: User
 * @author: MWS
 * @date: 2022/9/19 下午3:14
 * @description: 被增强的类
 */
@Component
public class User {
    public void add(){
        System.out.println("add.....");
    }

}
