import java.util.Scanner;
import java.util.TreeMap;

public class prozor {

    public static int extractRegion(String[][] grid, int startRow, int endRow, int startCol, int endCol) {
        int regionStarcount = 0;
        for (int i = startRow; i <= endRow; i++) { // Loop over rows
            for (int j = startCol; j <= endCol; j++) { // Loop over columns
                if (grid[i][j].equals("*")) {
                    regionStarcount++;
                }
            }
        }
        return regionStarcount;
    }
    
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String[] input = stdin.nextLine().split(" ");

        int pictureY = Integer.parseInt(input[0]);

        int pictureX = Integer.parseInt(input[1]);
        
        int racketSideLength = Integer.parseInt(input[2]);

        String[][] picture = new String[pictureX][pictureY];

        for (int i = 0; i < pictureY; i++) {
            String[] line = stdin.nextLine().split("");
            for (int j = 0; j < line.length; j++) {
                picture[i][j] = line[j];
            }
        }

        TreeMap<Integer, int[]> combinations = new TreeMap<>();

        for (int i = 0; i < pictureY; i++) {
            int startRow = 1;
            int startCol = 1;
            int endRow = racketSideLength-2;
            int endCol = racketSideLength-2;

            
            combinations.put(extractRegion(picture, startRow, endRow, startCol, endCol), new int[] {startRow, startCol, endRow, endCol});



            startCol++;
            
        }



        

        
        



    }
}
