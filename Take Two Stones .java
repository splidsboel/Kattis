import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int stones = stdin.nextInt();

        if (stones%2 == 0) {
            System.out.println("Bob");
        }else {
            System.out.println("Alice");
        }

    }
}