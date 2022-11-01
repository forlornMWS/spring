package xyz.mwszksnmdys.spring5.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.mwszksnmdys.spring5.entity.Book;
import xyz.mwszksnmdys.spring5.service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: TestBook
 * @author: MWS
 * @date: 2022/9/19 下午7:48
 * @description: Todo
 */
public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //添加
//        Book book = new Book();
//        book.setBookId("1");
//        book.setBookName("java");
//        book.setBookStatus("a");
//        bookService.addBook(book);

        // 修改
//        Book book = new Book();
//        book.setBookId("1");
//        book.setBookName("java Spring");
//        book.setBookStatus("mwszksnmdys");
//        bookService.updateBook(book);
//
//        // 删除
//        bookService.deleteBook("1");
//        int count = bookService.count();
//        System.out.println(count);
        // 查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);
        // 查询返回集合
//        List<Book> all =  bookService.findAll();
//        System.out.println(all);
        // 批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3", "java", "a"};
//        Object[] o2 = {"4", "php", "b"};
//        Object[] o3 = {"5", "c++","c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        // 批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"javadf", "a","3"};
//        Object[] o2 = {"phpdf", "b", "4"};
//        Object[] o3 = {"c+df+","c", "5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        // 批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }

}
