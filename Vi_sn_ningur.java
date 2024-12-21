import java.util.Scanner;

public class Vi_sn_ningur{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String word = stdin.nextLine();
        String backWord = "";


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            backWord = ch + backWord;
        }
        System.out.println(backWord);
    }
}