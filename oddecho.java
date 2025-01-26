import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int times = Integer.parseInt(stdin.nextLine());

        for (int i = 0; i < times; i++) {
            if (i%2==0) {
                System.out.println(stdin.nextLine());
            }else{
                stdin.nextLine();
            }
        }
    }
}
