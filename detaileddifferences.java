import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int noPairs = Integer.parseInt(stdin.nextLine());
        for (int i = 0; i < noPairs; i++) {
            String firstString = stdin.nextLine();
            String secondString = stdin.nextLine();
            boolean[] misMatches = new boolean[firstString.length()];
            for (int j = 0; j < firstString.length(); j++) {
                if (firstString.charAt(j)!=secondString.charAt(j)) {
                    misMatches[j] = true;
                }
            }
            System.out.println(firstString);
            System.out.println(secondString);
            for (boolean b : misMatches) {
                if (b) {
                    System.out.print("*");
                }else{System.out.print(".");}
            }
            System.out.println();
            System.out.println();

        }
    }
}
