import java.util.Scanner;

public class Besta_gj_fin_{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int numberOfGuests = stdin.nextInt();
        System.out.println(numberOfGuests);
        String bestGuest = "";
        int bestGuestNumber = 0;




        for (int i = 0; i < numberOfGuests; i++) {
            String guest = stdin.nextLine();
            int guestNumber = stdin.nextInt();

            if (guestNumber>bestGuestNumber) {
                bestGuest=guest;
            }
            
        }

    }
}