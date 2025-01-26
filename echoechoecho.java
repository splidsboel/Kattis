import java.util.Scanner;

public class echoechoecho {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String word = stdin.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(word+" ");
        }
    }
}
