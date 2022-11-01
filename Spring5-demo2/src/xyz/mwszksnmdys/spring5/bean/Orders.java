package xyz.mwszksnmdys.spring5.bean;

/**
 * @className: Orders
 * @author: MWS
 * @date: 2022/9/19 上午9:27
 * @description: Todo
 */
public class Orders {
    private String orderName;

    public Orders(){
        System.out.println("第一步，执行无参构造器");
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
        System.out.println("第二步，调用set方法设置属性");
    }

    public void initMethod(){
        System.out.println("第三步，执行初始化方法");
    }

    public void destroyMethod(){
        System.out.println("第五步，执行销毁方法");
    }
}
