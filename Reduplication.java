import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String word = stdin.nextLine();
        int times = stdin.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.print(word);
        }
    }
}