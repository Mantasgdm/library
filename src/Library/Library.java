package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public void displayBooks() {
        if (isLogedIn) {
            System.out.printf("%-15s %-15s %-15s", "Title", "Author", "IsAvailable");
            System.out.println();
            System.out.println("-".repeat(45));
            //System.out.println("\n");
            for (Book book : books) {
                System.out.printf("%-15s %-15s %-15s\n", book.getTitle(), book.getAuthor(), book.isAvailable());
            }

        } else {
            System.out.println("Please log in to view the library!");
        }

    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book checked out successfully: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book " + title + " is not available for checkout!");
    }

    public void modifyBookDetails(String title, String newTitle, String newAuthor) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.updateDetails(newTitle, newAuthor);
                System.out.println("Book details updated successfully!");
                return;
            }
        }
        System.out.println("Book " + title + " was not found in the library!");
    }

    private boolean isLogedIn;

    public boolean login(String username, String password) {
        if (UserAuthentication.authenticateUser(username, password)) {
            System.out.println("Login successfull! Welcome " + username + "!");
            isLogedIn = true;
            return true;
        } else {
            System.out.println("Login failed! Invalid username or password.");
            return false;
        }
    }

    public void logout() {
        isLogedIn = false;
        System.out.println("You've been logged out successfully! Goodbye!");
    }


}
