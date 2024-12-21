import java.util.Scanner;

public class Framt__ar_FIFA_{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int numImprovements = stdin.nextInt();

        int numImprovementsYear = stdin.nextInt();

        int yearsSince = numImprovements/numImprovementsYear;

        System.out.println(2022 + yearsSince);
    }
}