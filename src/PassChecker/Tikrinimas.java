package PassChecker;

import java.util.regex.Pattern;

public class Tikrinimas {
    private String password;

    public Tikrinimas(String password) {
        this.password = password;
    }

    public static String passwordChecker(String password) {
        StringBuilder feedback = new StringBuilder();
        String specialChar = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        if (password.length() < 8) {
            feedback.append("Password should be at least 8 characters long!\n");
        }
        if (!password.matches(".*[A-Z].*")) {
            feedback.append("Password should have at least one upper case letter!\n");
        }
        if (!password.matches(".*[a-z].*")) {
            feedback.append("Password should have at least one lower case letter!\n");
        }
        if (!password.matches(".*\\d.*")) {
            feedback.append("Password should have at least one digit!\n");
        }
        if (!password.matches(".*[" + Pattern.quote(specialChar) + "].*")) {
            feedback.append("Password should have at least one special character!\n");
        }
        return feedback.toString().trim();
    }

}
