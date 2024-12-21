import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class basicprogramming2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String[] instructions = stdin.nextLine().split(" ");
        int noNumbers = Integer.parseInt(instructions[0]);
        int t = Integer.parseInt(instructions[1]);


        ArrayList<Integer> numbers = new ArrayList<>();

        for (String integer : stdin.nextLine().split(" ")) {
            numbers.add(Integer.parseInt(integer));
        }


        switch (t) {
            case 1:
                HashSet<Integer> seenNumbers1 = new HashSet<>();
                String result = null;
                for (Integer integer : numbers) {
                    int complement = 7777-integer;
                    if (seenNumbers1.contains(complement)) {
                        result = "Yes";
                    }
                    seenNumbers1.add(integer);

                }
                if (result==null) {
                    System.out.println("No");
                }else{
                    System.out.println(result);
                }
                break;
            
            case 2:
                ArrayList<Integer> seenNumbers = new ArrayList<>();
                for (Integer integer : numbers) {
                    if (seenNumbers.contains(integer)) {
                        System.out.println("Contains duplicate");
                        break;
                    }
                    seenNumbers.add(integer);
                }
                System.out.println("Unique");
                break;

            case 3:
                HashMap<Integer, Integer> numberMap = new HashMap<>();
                for (Integer integer : numbers) {
                    numberMap.putIfAbsent(integer, 0);
                    numberMap.put(integer, numberMap.get(integer)+1);
                }


                AtomicReference<Integer> output3 = new AtomicReference<>(null);
                numberMap.forEach((key, value) -> {
                    if (value>noNumbers/2) {
                        output3.set(key);;
                    }
                });

                if (output3.get()==null) {
                    System.out.println(-1);
                }else{
                    System.out.println(output3.get());
                }
                break;
            case 4:
                Collections.sort(numbers);
                if (noNumbers%2==1) {
                    System.out.println(numbers.get(numbers.size()/2+1));
                }else{
                    int firstNo = (int) numbers.size()/2;
                    int secondNo = (int) numbers.size()/2+1;

                    System.out.print(firstNo);
                    System.out.print(" " +secondNo);
                }

                break;
            case 5:
                ArrayList<Integer> sortedNumbers = new ArrayList<>();
                Pattern p = Pattern.compile("^[1-9][0-9]{2}$");

                for (Integer integer : numbers) {
                    Matcher m = p.matcher(integer.toString()); // Corrected here
                    if (m.matches()) {
                        sortedNumbers.add(integer);
                    }
                }
                Collections.sort(sortedNumbers);
                String output = "";
                for (Integer integer : sortedNumbers) {
                    output+=integer + " ";
                }
                System.out.println(output.strip());
            default:
                break;
            
        }


    }
}
