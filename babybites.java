import java.util.Scanner;

public class babybites {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        stdin.nextLine();
        String[] counts = stdin.nextLine().split(" ");
        boolean checksOut = true;
        int currentCount = 1;
        for (String string : counts) {
            if (!(string.equals("mumble")||Integer.parseInt(string)==currentCount)) {
                checksOut=false;
                break;
            }
            currentCount++;
        }
        if (checksOut) {
            System.out.println("makes sense");
        }else{System.out.println("something is fishy");}
    }

}
