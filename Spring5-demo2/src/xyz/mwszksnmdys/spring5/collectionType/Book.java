package xyz.mwszksnmdys.spring5.collectionType;

import java.util.List;

/**
 * @className: Book
 * @author: MWS
 * @date: 2022/9/16 下午5:15
 * @description: Todo
 */
public class Book {
    public void setList(List<String> list) {
        this.list = list;
    }

    private List<String> list;

    public void test(){
        System.out.println(list);
    }

}
