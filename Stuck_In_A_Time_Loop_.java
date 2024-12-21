import java.util.Scanner;

public class Stuck_In_A_Time_Loop_{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int number = stdin.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println((i+1) + " Abracadabra");
        }
    }
}