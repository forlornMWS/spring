interface ReadingListRepository{
    List<Book> findbyReader (String reader)
    void save(Book book)
}