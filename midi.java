import java.util.HashMap;
import java.util.Scanner;

public class midi {
    private static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    } 
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int times = Integer.parseInt(stdin.nextLine());

        HashMap<Integer, String> wordMap = new HashMap<>();

        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < times; i++) {
            wordMap.put(i, stdin.nextLine());
        }

        for (int i = times-1; i >= 0; i--) {
            finalString.append(reverseString(wordMap.get(i)));
        }

        System.out.println(finalString.toString());
    }
}
