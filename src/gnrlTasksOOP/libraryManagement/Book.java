package gnrlTasksOOP.libraryManagement;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println("You have returned: " + title);
    }

}
