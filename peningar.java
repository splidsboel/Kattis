import java.util.Scanner;

public class peningar {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // Input
        String[] firstLine = stdin.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int d = Integer.parseInt(firstLine[1]);

        String[] cellsString = stdin.nextLine().split(" ");
        int[] cells = new int[n];
        for (int i = 0; i < n; i++) {
            cells[i] = Integer.parseInt(cellsString[i]);
        }

        // Tracking visited cells
        boolean[] visited = new boolean[n];
        long totalAmount = 0;
        int currentIndex = 0;

        // Main traversal loop
        while (!visited[currentIndex]) {
            visited[currentIndex] = true; // Mark cell as visited
            totalAmount += cells[currentIndex]; // Add money from current cell
            currentIndex = (currentIndex + d) % n; // Move to the next cell
        }

        System.out.println(totalAmount);
    }
}
