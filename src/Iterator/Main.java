package Iterator;/** * @Author:zhenyuan * @Date:Created in 19:57 2018/12/26 */public class Main {    public static void main(String[] args){        BookShlf bookShlf = new BookShlf(6);        bookShlf.addBook(new Book("a"));        bookShlf.addBook(new Book("b"));        bookShlf.addBook(new Book("c"));        bookShlf.addBook(new Book("d"));        bookShlf.addBook(new Book("e"));        Iterator bookShelfIterator = bookShlf.iterator();        while (bookShelfIterator.hasNext()){            Book next = (Book)bookShelfIterator.next();            System.out.println(next.getName());        }    }}