import java.util.Scanner;
public class Hra_greining{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String DNA = stdin.nextLine();

        if (DNA.contains("COV")) {
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }



    }
}