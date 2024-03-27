package Library;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
    private static final Map<String, String> userCredentials = new HashMap<>();

    static {
        userCredentials.put("admin", "admin123");
        userCredentials.put("user1", "password123");
        userCredentials.put("user2", "labadienele");
        userCredentials.put("user3", "grazusoras");
    }

    public static boolean authenticateUser(String username, String password) {
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            return true;
        }
        return false;
    }

}
