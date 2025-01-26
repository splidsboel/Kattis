import java.util.Scanner;

public class addtwonumbers {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String[] nums = stdin.nextLine().split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        System.out.println(num1+num2);
        
    }
}
