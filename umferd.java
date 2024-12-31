import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class umferd {

    public static long countDotsInLane(String s){
        return s.chars().filter(ch -> ch == '.').count();
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int noCellsPerLane = Integer.parseInt(stdin.nextLine());

        int noLanes = Integer.parseInt(stdin.nextLine());

        long totalCells = noCellsPerLane * noLanes;

        long totalNoDots = 0;

        HashMap<Integer, String> lanes = new HashMap<>();

        for (int i = 0; i < noLanes; i++) {
            lanes.put(i, stdin.nextLine());
        }

        for (String value : lanes.values()){
            totalNoDots+=countDotsInLane(value);
        }

        float result = (float) totalNoDots/totalCells;

        System.out.println(result);
    }
}
