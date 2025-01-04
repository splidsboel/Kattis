import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String[] moves = stdin.nextLine().split("");

        boolean[] cups = new boolean[3];
        cups[0] = true;

        for (String move : moves) {
            if (move.equals("A")&&(cups[0]||cups[1])) {
                cups[0] = !cups[0];
                cups[1] = !cups[1];
            }else if (move.equals("B")&&(cups[1]||cups[2])) {
                cups[1] = !cups[1];
                cups[2] = !cups[2];
            }else if (move.equals("C")&&(cups[0]||cups[2])) {
                cups[0] = !cups[0];
                cups[2] = !cups[2];
            }
        }

        for (int i = 0; i < cups.length; i++) {
            if (cups[i]) {
                System.out.println(i+1);
                break;
            }
        }
        
    }
}
