package xyz.mwszksnmdys.spring5;

/**
 * @className: UserDaoImpl
 * @author: MWS
 * @date: 2022/9/19 下午2:08
 * @description: Todo
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
