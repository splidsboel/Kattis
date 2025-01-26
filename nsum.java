import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int times = Integer.parseInt(stdin.nextLine());
        String[] numbers = stdin.nextLine().split(" ");
        int result = 0;

        for (String string : numbers) {
            result+=Integer.parseInt(string);
        }
        System.out.println(result);
    }
}
