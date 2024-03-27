package Library;

import PassChecker.Tikrinimas;

import java.util.Scanner;

public class LibraryManagement {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Book book1 = new Book("One day", "John Smith");
        Book book2 = new Book("Two days", "Ricky Morty");
        Book book3 = new Book("Three days", "Sam Black");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);  // Įdedu knygas į biblioteką
        library.addBook(book3);
        library.displayBooks(); // Parodo bibliotekoje esančias knygas
        library.modifyBookDetails("One day", "Last day", "Jonas Jonukas"); // Pakeičiu knygos pavadinimą ir autorių
        library.checkOutBook("Three days"); // Kažkas pasiima knygą iš bibliotekos
        library.displayBooks(); // Parodo atnaujintą bibliotekos sąrašą

        library.login("user1", "password123"); // Prisijungimas (extra)
        library.logout(); // Atsijungimas (extra)
        System.out.println("");

        //nuo čia library projektas baigiasi, taip pat dariau password checkerį.

        System.out.print("Enter password: "); // Įdėjau password checkerį (extra)
        String password = sc.nextLine();
        String feedback = Tikrinimas.passwordChecker(password);

        if (feedback.isEmpty()) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid:");
            System.out.println(feedback);
        }

    }
}
