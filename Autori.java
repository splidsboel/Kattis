import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String input = stdin.nextLine();
        
        String finalString = "";

        String[] splitString = input.split("-");

        for (int i = 0; i < splitString.length; i++) {
            finalString += splitString[i].charAt(0);
        }

        System.out.println(finalString);



    }
}