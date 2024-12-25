import java.util.Scanner;

public class xorsist {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int input = Integer.parseInt(stdin.nextLine());

        int noPossessed;

        int lastResult = 1;

        for (int i = 2; i <= input; i++) {
            lastResult ^= i;
        }

        if (lastResult==0) {
            System.out.println("Enginn");
        }else if (lastResult>input) {
            System.out.println("Gunnar");
        }else{
            System.out.println(lastResult);
        }

    }
}
