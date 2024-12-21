import java.util.Scanner;

public class Leyni_j_nusta{
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);

        String x = stdin.nextLine();

        System.out.println(x.replaceAll("\\s", ""));
    }
}