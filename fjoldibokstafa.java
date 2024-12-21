import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fjoldibokstafa{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String[] x = stdin.nextLine().split("");

        Pattern p = Pattern.compile("[a-zA-Z]");

        int noLetters = 0;

        for (String string : x) {
            Matcher m = p.matcher(string);

            if (m.matches()) {
                noLetters++;
            }
        }

        System.out.println(noLetters);
    }
}