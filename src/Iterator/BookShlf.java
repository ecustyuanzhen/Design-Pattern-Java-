package Iterator;import java.util.ArrayList;import java.util.List;/** * @Author:zhenyuan * @Date:Created in 19:44 2018/12/26 */public class BookShlf implements Aggregate {    private List<Book> books;    public BookShlf() {        this.books = new ArrayList<Book>();    }    public Book getBook(int index) {        return books.get(index);    }    public void addBook(Book book) {        books.add(book);    }    public int getLength() {        return books.size();    }    @Override    public Iterator iterator() {        return new BookShelfIterator(this);    }}