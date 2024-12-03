import java.util.Scanner;

public class ahh {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String john = stdin.nextLine();
        String doctor = stdin.nextLine();


        if (john.length()>= doctor.length()) {
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
