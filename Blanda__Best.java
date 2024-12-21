import java.util.Scanner;

public class Blanda__Best{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int numberOfMeat = myScanner.nextInt();
        String typeMeat = myScanner.next();
        

        if (numberOfMeat == 1) {
            System.out.println(typeMeat);

        } else{
            System.out.println("blandad best");
        }
        
    }
}