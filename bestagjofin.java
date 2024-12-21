import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bestagjofin{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int numGuest = Integer.parseInt(stdin.nextLine());

        HashMap<String, Integer> guestMap = new HashMap<>();

        for (int i = 0; i < numGuest; i++) {
            String[] nextLine = stdin.nextLine().split(" ");
            guestMap.put(nextLine[0], Integer.parseInt(nextLine[1]));
        }

        String bestGuest = "";

        for (Map.Entry<String, Integer> entry : guestMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (bestGuest == "") {
                bestGuest = key;
            }
            if (value>guestMap.get(bestGuest)) {
                bestGuest = key;
            }      
        }

        System.out.println(bestGuest);



    }


}