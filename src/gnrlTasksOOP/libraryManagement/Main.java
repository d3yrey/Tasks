package gnrlTasksOOP.libraryManagement;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        library.showAvailableBooks();
        library.borrowBook("1984");
        library.showAvailableBooks();
        library.returnBook("1984");
        library.showAvailableBooks();

    }
}
