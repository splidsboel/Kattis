import java.util.Scanner;

public class Takkar{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int trump = stdin.nextInt();
        int kim = stdin.nextInt();

        if (trump>kim) {
            System.out.println("MAGA!");
        } else if (trump<kim){
            System.out.println("FAKE NEWS!");
        } else if (trump ==kim){
            System.out.println("WORLD WAR 3!");
        }else{
            ;
        }
    }
}