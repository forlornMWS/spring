package xyz.mwszksnmdys.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.mwszksnmdys.spring5.dao.BookDao;
import xyz.mwszksnmdys.spring5.entity.Book;

import java.util.List;
import java.util.Objects;

/**
 * @className: BookService
 * @author: MWS
 * @date: 2022/9/19 下午5:26
 * @description: Todo
 */
@Service
public class BookService {
    // 注入dao
    @Autowired
    private BookDao bookDao;


    // 添加方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    // 查询表中记录数
    public int count(){
        return bookDao.selectCount();
    }

    // 查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAdd(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs)
    {
        bookDao.batchUpdateBook(batchArgs);
    }

    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
