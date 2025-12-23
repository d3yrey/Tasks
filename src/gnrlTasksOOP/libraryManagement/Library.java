package gnrlTasksOOP.libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books= new ArrayList<>();

    void addBook(Book book){
        books.add(book);
    }

    void showAvailableBooks(){
        System.out.println("Available books:");
        for(Book book : books){
            if(book.isAvailable()){
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
            }
        }
    }

    /////////////////////////////////////////////////////////bu hisseden asagisini Ai in komeyi ile yazdim aglima gelmedi ilk basda(nece cagirmali oludugumu bilmediyim ucun)
    public void borrowBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.borrow();
                return;
            }
        }
        System.out.println("Book titled '" + title + "' not found in the library.");
    }
    public void returnBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.returnBook();
                return;
            }
        }
        System.out.println("Book titled '" + title + "' not found in the library.");
    }

}
