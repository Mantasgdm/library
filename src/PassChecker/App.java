package PassChecker;

import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.print("Enter password: ");
            String password = sc.next();
            String feedback = Tikrinimas.passwordChecker(password);

            if (feedback.isEmpty()) {
                System.out.println("Password meets the specified criteria!");
                break;
            } else {
                System.out.println(feedback);
            }
        }
        sc.close();


    }
}