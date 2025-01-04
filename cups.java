import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class cups {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int noLines = Integer.parseInt(stdin.nextLine());
        HashMap<String, Integer> cupMap = new HashMap<>();

        for (int i = 0; i < noLines; i++) {
            String[] line = stdin.nextLine().split(" ");
            try {
                cupMap.put(line[0], Integer.parseInt(line[1]));
            } catch (Exception e) {
                cupMap.put(line[1], Integer.parseInt(line[0])/2);
            }
        }
        HashMap<String, Integer> sortedCupMap = cupMap.entrySet()
                    .stream()
                    .sorted((i1, i2) ->i1.getValue().compareTo(i2.getValue()))
                    .collect(Collectors.toMap(
                        Map.Entry::getKey, 
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        

        for(Map.Entry<String, Integer> entry : sortedCupMap.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
