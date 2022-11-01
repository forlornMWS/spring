package xyz.mwszksnmdys.spring5.bean;

/**
 * @className: Dept
 * @author: MWS
 * @date: 2022/9/16 下午4:15
 * @description: Todo
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return dname ;
    }
}
