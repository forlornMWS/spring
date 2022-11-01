package xyz.mwszksnmdys.spring5.dao;

import xyz.mwszksnmdys.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);// 添加方法

    void updateBook(Book book);

    void deleteBook(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
