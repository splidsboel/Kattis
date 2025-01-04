import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hakkari {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String[] input = stdin.nextLine().split(" ");

        int noLines = Integer.parseInt(input[0]);

        int lenLines = Integer.parseInt(input[1]);

        int noMines = 0;

        ArrayList<String> bombList = new ArrayList<>();

        for (int i = 1; i <= noLines; i++) {
            String[] line = stdin.nextLine().split("");
            for (int j = 0; j < line.length; j++) {
                if (line[j].equals("*")) {
                    bombList.add(i + " " + (j+1));
                    noMines++;
                }
            }

        }

        System.out.println(noMines);

        for (String string : bombList) {
            System.out.println(string);
        }

        

    }
}
