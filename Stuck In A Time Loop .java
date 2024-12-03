import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int number = stdin.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println((i+1) + " Abracadabra");
        }
    }
}