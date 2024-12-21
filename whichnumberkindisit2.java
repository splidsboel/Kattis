import java.util.ArrayList;
import java.util.Scanner;

public class whichnumberkindisit2 {
    public static void main(String[] args) {
        Scanner stdin= new Scanner(System.in);

        Integer nolines = Integer.parseInt(stdin.nextLine());
        
        ArrayList<Integer> intData = new ArrayList<Integer>();

        for (int i = 0; i < nolines; i++) {
            intData.add(Integer.parseInt(stdin.nextLine()));
        }


        for (Integer i : intData) {
            Boolean odd = Math.abs(i % 2) == 1;
            double d = i;

            double sqrt = Math.sqrt(d);

            Boolean perfectSquare = (sqrt-Math.floor(sqrt)==0);

            if (odd && perfectSquare) {
                System.out.println("OS");
            } else if (odd) {
                System.out.println("O");
            } else if (perfectSquare) {
                System.out.println("S");
            } else {
                System.out.println("EMPTY");
            }
            



        }


    }
}
