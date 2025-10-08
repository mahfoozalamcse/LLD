package OOPSPART1;
import java.util.ArrayList;
import java.util.List;

// Book class encapsulation
// We encapsulate the details (title, author, isAvailable)
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return title + " by " + author + " | " + (isAvailable ? "Available" : "Checked Out");
    }
}

// 2. Abstract Class — User (Abstraction)
//    We define common operations like searchBook() and checkoutBook().


abstract class User {
    protected String name;
    protected int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public abstract void checkoutBook(Book book);

    public void searchBook(String title, List<Book> books) {
        System.out.println("Searching for: " + title);
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                return;
            }
        }
        System.out.println("Book not found!");
    }
}


// 3. Inheritance — Student and Librarian
//    Both extend User, but perform different checkout logic (Polymorphism).

class Student extends User {
    public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void checkoutBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " checked out the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already checked out.");
        }
    }
}

class Librarian extends User {
    public Librarian(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void checkoutBook(Book book) {
        System.out.println("Librarians usually don't checkout books for themselves!");
    }

    public void addBook(List<Book> books, Book newBook) {
        books.add(newBook);
        System.out.println("Added: " + newBook.getTitle());
    }

    public void removeBook(List<Book> books, String title) {
        books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
        System.out.println("Removed book: " + title);
    }
}


// 4. Library Class — Manage Books (Composition)
//    The Library class contains a list of books (HAS-A relationship).

class Library {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void showAllBooks() {
        System.out.println("   Library Books All...");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("......................End.. ");
    }
}

public class Project1 {
   public static void main(String[] args) {
        Library library = new Library();

        Librarian librarian = new Librarian("Raj", 101);
        Student student = new Student("Mahfooz", 202);

        // Librarian adds books
        librarian.addBook(library.getBooks(), new Book("Clean Code", "Robert C. Martin"));
        librarian.addBook(library.getBooks(), new Book("Effective Java", "Joshua Bloch"));
        librarian.addBook(library.getBooks(), new Book("Design Patterns", "GoF"));

        library.showAllBooks();

        // Student searches for a book
        student.searchBook("Clean Code", library.getBooks());

        // Student checks out a book
        student.checkoutBook(library.getBooks().get(0));

        library.showAllBooks();

        // Librarian tries to checkout a book
        librarian.checkoutBook(library.getBooks().get(1));

        // Librarian removes a book
        librarian.removeBook(library.getBooks(), "Design Patterns");

        library.showAllBooks();
    }
}
