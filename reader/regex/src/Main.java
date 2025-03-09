import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "0x23F";
        String regex = "(0x)[0-9A-F]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}