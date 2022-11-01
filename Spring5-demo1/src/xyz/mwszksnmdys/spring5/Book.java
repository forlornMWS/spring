package xyz.mwszksnmdys.spring5;

/**
 * @className: Book
 * @author: MWS
 * @date: 2022/9/16 下午3:14
 * @description: Todo
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    // 有参构造注入
    public Book(String bookName) {
        this.bookName = bookName;
    }

    // set方法注入
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Book() {
    }

    public void testDemo(){
        System.out.println(bookAuthor + "::" +bookName +"::" + address);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Harry Potter");
    }
}
