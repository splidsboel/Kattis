import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class everywhere {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int noTestCases = Integer.parseInt(stdin.nextLine());

        for (int i = 0; i < noTestCases; i++) {
            int noCities = Integer.parseInt(stdin.nextLine());
            Set<String> cities = new HashSet<>();
            for (int j = 0; j < noCities; j++) {
                cities.add(stdin.nextLine());
            }
            System.out.println(cities.size());
        }
    }
}
