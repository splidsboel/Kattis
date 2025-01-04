import java.util.Scanner;

public class bookingaroom {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String[] input = stdin.nextLine().split(" ");

        int noRooms = Integer.parseInt(input[0]);

        int noBookedRooms = Integer.parseInt(input[1]);

        boolean[] rooms = new boolean[noRooms];

        for (int i = 0; i < noBookedRooms; i++) {
            int room = Integer.parseInt(stdin.nextLine());
            rooms[room-1] = true;
        }
        boolean anyRoom = false;
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i]) {
                anyRoom = true;
                System.out.println(i+1);
                break;
            }
        }
        if (!anyRoom) {
            System.out.println("too late");
        }
    }
}
