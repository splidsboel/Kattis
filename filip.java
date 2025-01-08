import java.util.Scanner;

public class filip {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String[] numbers = stdin.nextLine().split(" ");
        int firstNumber = Integer.parseInt(new StringBuilder(numbers[0]).reverse().toString());
        int secondNumber = Integer.parseInt(new StringBuilder(numbers[1]).reverse().toString());
        System.out.println(firstNumber>secondNumber?firstNumber:secondNumber);

        
    }
}
