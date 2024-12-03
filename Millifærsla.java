import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int monnei = stdin.nextInt(), fjei = stdin.nextInt(), dolladollabilljoll = stdin.nextInt();

        if (monnei<fjei && monnei< dolladollabilljoll) {
            System.out.println("Monnei");
        } else if (fjei<monnei && fjei < dolladollabilljoll) {
            System.out.println("Fjee");
        }else if (dolladollabilljoll<monnei && dolladollabilljoll<fjei) {
            System.out.println("Dolladollabilljoll");
        }
    }
}