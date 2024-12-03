import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int numImprovements = stdin.nextInt();

        int numImprovementsYear = stdin.nextInt();

        int yearsSince = numImprovements/numImprovementsYear;

        System.out.println(2022 + yearsSince);
    }
}