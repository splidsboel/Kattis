import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class statistics {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int caseNo = 1;
        while (stdin.hasNextLine()) {
            int[] line = Arrays.stream(stdin.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            
            int[] numbers = Arrays.copyOfRange(line, 1, line.length);

            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();

            System.out.println("Case "+ caseNo + ": "+ min+ " "+ max+" "+ (max-min) );
            caseNo++;
        }
    }
}
