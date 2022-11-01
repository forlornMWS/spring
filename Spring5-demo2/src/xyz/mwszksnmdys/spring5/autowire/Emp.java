package xyz.mwszksnmdys.spring5.autowire;

/**
 * @className: Emp
 * @author: MWS
 * @date: 2022/9/19 上午9:56
 * @description: Todo
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
