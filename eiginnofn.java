import java.util.HashMap;
import java.util.Scanner;

public class eiginnofn {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int noResidents = Integer.parseInt(stdin.nextLine());

        HashMap<String, String> residentNames = new HashMap<>();

        for (int i = 0; i < noResidents; i++) {
            String[] resident = stdin.nextLine().split(" ");
            if (resident.length==2) {
                residentNames.put(resident[0], resident[1]);
            }else{
                residentNames.put(resident[0], "");
            }
        }

        int doorbellQueries = Integer.parseInt(stdin.nextLine());

        for (int i = 0; i < doorbellQueries; i++) {
            String query = stdin.nextLine();

            if (residentNames.containsKey(query)) {
                if (residentNames.get(query).equals("")) {
                    System.out.println("Jebb");
                }else{
                    System.out.println("Neibb en " + query + " " + residentNames.get(query) + " er heima");
                }
            }else{
                System.out.println("Neibb");
            }
        }

    }
}
