import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int number = Integer.parseInt(stdin.nextLine());

        HashMap<Integer, Integer> numbers = new HashMap();

        for (int i = 0; i < number; i++) {
            numbers.put(i, Integer.parseInt(stdin.nextLine()));
        }

        for (int i = numbers.size()-1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
