import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Scanner;

public class pinnifraendi {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int length = Integer.parseInt(stdin.nextLine());

        BigDecimal ten = BigDecimal.valueOf(10);
        BigDecimal result = BigDecimal.ONE.divide(ten.pow(length), MathContext.DECIMAL128);

        System.out.println(result.toPlainString());
    }
}