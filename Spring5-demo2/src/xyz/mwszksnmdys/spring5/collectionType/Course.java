package xyz.mwszksnmdys.spring5.collectionType;

/**
 * @className: Course
 * @author: MWS
 * @date: 2022/9/16 下午5:07
 * @description: Todo
 */
public class Course {
    private String cname;
    public void setCname(String cname){
        this.cname = cname;
    }

    @Override
    public String toString() {
        return cname;
    }
}
