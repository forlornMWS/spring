package xyz.mwszksnmdys.spring5.bean;

/**
 * @className: Emp
 * @author: MWS
 * @date: 2022/9/16 下午4:16
 * @description: Todo
 */
public class Emp {
    private String ename;
    private String gender;

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void test(){
        System.out.println(ename + "::" + gender + "::" + dept);
    }

}
