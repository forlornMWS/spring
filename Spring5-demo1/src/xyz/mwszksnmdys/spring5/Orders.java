package xyz.mwszksnmdys.spring5;

/**
 * @className: Orders
 * @author: MWS
 * @date: 2022/9/16 下午3:26
 * @description: Todo
 */
public class Orders {
    private String orderName;
    private String address;

    public Orders(String orderName, String address) {
        this.orderName = orderName;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(orderName + address);
    }
}
