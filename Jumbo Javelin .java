import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int times = stdin.nextInt();

        int javLength = 0;

        for (int i = 0; i < times; i++) {
            javLength+=stdin.nextInt();
            javLength-=1; 
        }
        javLength+=1;
        System.out.println(javLength);

        
    }
}