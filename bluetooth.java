import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bluetooth {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int noProblems = Integer.parseInt(stdin.nextLine());

        HashMap<String, String> problemMap = new HashMap<>();


        boolean leftHasTeeth = false;
        boolean rightHasTeeth = false;
        boolean left = true;
        boolean right = true;

        for (int i = 0; i < noProblems; i++) {
            String[] problem = stdin.nextLine().split(" ");
            problemMap.put(problem[0], problem[1]);
        }


        //check for blue teeth
        for (Map.Entry<String,String> entry : problemMap.entrySet()){
            if (entry.getValue().equals("b")) {
                if (entry.getKey().startsWith("+")||entry.getKey().startsWith("-")) {
                    left = false;
                }else{
                    right = false;
                }
                
            }
        }

        //check if missing teeth disqualify side    
        long leftUpperToothCount = 8-problemMap.entrySet()
                                                .stream()
                                                .filter(entry->entry.getKey().startsWith("+"))
                                                .count();

        long leftLowerToothCount = 8-problemMap.entrySet()
                                                .stream()
                                                .filter(entry->entry.getKey().startsWith("-"))
                                                .count();

        long rightUpperToothCount = 8-problemMap.entrySet()
                                                .stream()
                                                .filter(entry->entry.getKey().endsWith("+"))
                                                .count();

        long rightLowerToothCount = 8-problemMap.entrySet()
                                                .stream()
                                                .filter(entry->entry.getKey().endsWith("-"))
                                                .count();                                            

        if (leftUpperToothCount>0&&leftLowerToothCount>0) {
            leftHasTeeth=true;
        }

        if (rightUpperToothCount>0&&rightLowerToothCount>0) {
            rightHasTeeth=true;
        }
        

        //output logic
        if (right&&rightHasTeeth) {
            System.out.println(1);
        }else if (left&&leftHasTeeth) {
            System.out.println(0);
        }else{
            System.out.println(2);
        }

    }
}
