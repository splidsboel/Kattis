import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int times = stdin.nextInt();

        for (int i = 0; i < times; i++) {
            String name = stdin.next();
            System.out.println("Takk " + name);
        }
    }
}