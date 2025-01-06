import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int friendCorrect = Integer.parseInt(stdin.nextLine());

        String[] myAnswers = stdin.nextLine().split("");

        String[] friendAnswers = stdin.nextLine().split("");

        int mismatches = 0;
        int  matches = 0;

        for (int i = 0; i < friendAnswers.length; i++) {
            if (!myAnswers[i].equals(friendAnswers[i])) {
                mismatches++;
            }else{
                matches++;
            }
        }


        int possibleCorrect=matches;
        int totalQuestions = friendAnswers.length;
        int friendWrong = totalQuestions-friendCorrect;
        possibleCorrect+=Math.min(mismatches, friendWrong);

        System.out.println(possibleCorrect);
    }
}
