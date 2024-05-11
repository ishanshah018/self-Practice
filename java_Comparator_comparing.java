/*
 This Java code demonstrates sorting a collection of Book objects using different criteria (book ID and book name).
  It showcases the use of comparators with Java's Collections.sort method 
  and highlights the importance of getter method
 */

import java.util.*;

class Book {
    int Bookid;
    String bookname;

    public Book(int bookid, String bookname) {
        Bookid = bookid;
        this.bookname = bookname;
    }

    public int getBookid() {
        return Bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookid(int bookid) {
        Bookid = bookid;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    // Override
    public String toString() {
        return "{Bookid=" + Bookid + ", bookname=" + bookname + "}";
    }

}

class ComparatorDemo {
    public static void main(String[] args) {
        Book b1 = new Book(55, "Java");
        Book b2 = new Book(14, "DS");
        Book b3 = new Book(49, "FEE");
        Book b4 = new Book(71, "DBMS");

        // System.out.println(b1);
        // System.out.println(b2);
        // System.out.println(b3);
        // System.out.println(b4);

        ArrayList<Book> al1 = new ArrayList<Book>();
        al1.add(b1);
        al1.add(b2);
        al1.add(b3);
        al1.add(b4);

        System.out.println("List of Books is: " + al1);

        // Sorting elements as per ID

        Collections.sort(al1, Comparator.comparing(Book::getBookid));
        System.out.println(al1); // will get books as per ascending book id

        Collections.sort(al1, Comparator.comparing(Book::getBookname));
        System.out.println(al1); // will get books as per ascending book Name as per ABCD format

        Collections.sort(al1, Comparator.comparing(Book::getBookid).reversed());
        System.out.println(al1); // will get books as per descending book id
    }
}
