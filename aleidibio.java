import java.util.Scanner;

public class aleidibio {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();

        int result = c-(a+b);
        System.out.println(result);
    }
}