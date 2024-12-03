import java.util.List;
import java.util.Scanner;

public class heimavinna {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String[] line = stdin.nextLine().split(";");
        Integer problems = 0;
        for (String string : line) {
            String[] splitString = string.split("-");
            if (splitString.length>1) {
                Integer subtraction = Integer.valueOf(splitString[1])-Integer.valueOf(splitString[0])+1;
                problems+=subtraction;
            }else{
                problems++;
            }
        }
        System.out.println(problems);

    }
}
