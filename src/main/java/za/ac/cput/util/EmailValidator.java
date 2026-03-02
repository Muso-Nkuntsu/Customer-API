package za.ac.cput.util;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    private static final String Email_Regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(Email_Regex, Pattern.CASE_INSENSITIVE);

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
