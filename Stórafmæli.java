import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int anniversary = stdin.nextInt();

        if (anniversary%10 == 0){
            System.out.println("Jebb");
        }else{
            System.out.println("Neibb");
        }
    }
}