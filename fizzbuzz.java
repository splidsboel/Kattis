import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String[] input = stdin.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);




        for (int i = 1; i <= Integer.parseInt(input[2]); i++) {
            if (i%x==0){
                System.out.print("Fizz");
            }
            if (i%y==0) {
                System.out.print("Buzz");
            }
            if (!(i%x==0||i%y==0)) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
