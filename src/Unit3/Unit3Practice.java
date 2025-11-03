package Unit3;

public class Unit3Practice {
    public static void main(String[] args) {
    }

    public static boolean isValidUsername(String username) {
        if (username.length() != 8)
            return false;
        return username.startsWith("STU");
    }
}
