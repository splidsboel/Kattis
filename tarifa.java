import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int monthlyLimit = Integer.parseInt(stdin.nextLine());
        int months = Integer.parseInt(stdin.nextLine());
        int extraMB = 0;

        for (int i = 0; i < months; i++) {
            int usage = Integer.parseInt(stdin.nextLine());
            if (usage<monthlyLimit) {
                extraMB+=monthlyLimit-usage;
            }
            if (usage>monthlyLimit) {
                extraMB-=usage-monthlyLimit;
            }
        }
        System.out.println(extraMB+10);
    }
}
