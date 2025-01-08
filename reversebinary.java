import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int number = Integer.parseInt(stdin.nextLine());
        System.out.println(Integer.parseInt(new StringBuilder(Integer.toBinaryString(number)).reverse().toString(), 2));
    }
}
