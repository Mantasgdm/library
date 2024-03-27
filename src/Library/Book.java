package Library;

public class Book {
    String title;
    String author;
    boolean available;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void updateDetails(String newTitle, String newAuthor) {
        this.title = newTitle;
        this.author = newAuthor;
    }
}
