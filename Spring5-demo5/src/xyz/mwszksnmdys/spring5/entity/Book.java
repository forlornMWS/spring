package xyz.mwszksnmdys.spring5.entity;

/**
 * @className: Book
 * @author: MWS
 * @date: 2022/9/19 下午7:36
 * @description: Todo
 */
public class Book {
   private String userid;
   private String username;
   private String ustatus;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
