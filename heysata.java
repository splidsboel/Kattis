import java.util.Scanner;

public class heysata {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int stringLen = Integer.valueOf(stdin.nextLine());
        String letter = stdin.nextLine().toLowerCase();
        String string = stdin.nextLine().toLowerCase();

        for (String i : string.split("")) {
            if (i.equals(letter)) {
                System.out.println("Unnar fann hana!");
            }
            
        }
        System.out.println("Unnar fann hana ekki!");
    
    }
}
