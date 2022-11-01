package xyz.mwszksnmdys.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @className: JDKProxy
 * @author: MWS
 * @date: 2022/9/19 下午2:11
 * @description: Todo
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces  = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        System.out.println(add);
    }

}

// 创建代理对象代码
class UserDaoProxy implements InvocationHandler{
    // 传递代理对象的委托对象
    // 1. 有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    // 编写增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("before method " + method.getName() + ", params: " + Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(obj, args);

        // 方法之后
        System.out.println("after method " + obj);
        return res;
    }
}
