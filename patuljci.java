import java.util.Scanner;

public class patuljci {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int[] dwarves = new int[9];

        for (int i = 0; i < dwarves.length; i++) {
            dwarves[i] = Integer.parseInt(stdin.nextLine());
        }
    }
}
