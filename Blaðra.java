import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int v = stdin.nextInt();
        int a = stdin.nextInt();
        int t = stdin.nextInt();

        double d = v*t+0.5*a*t*t;


        System.out.println(d);
    }
}