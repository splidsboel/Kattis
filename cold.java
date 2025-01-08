import java.util.Arrays;
import java.util.Scanner;

public class cold {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int[] temperature = new int[Integer.parseInt(stdin.nextLine())];

        temperature = Arrays.stream(stdin.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i]<0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
