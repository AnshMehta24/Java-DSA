package Java_Math;
import java.util.Scanner;
import java.lang.Math;
public class ArmStrongNumber_CN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int dup = n;
        int numberOfDigits = 0;

        while (dup > 0) {
            dup /= 10;
            numberOfDigits++;
        }

        dup = n;

        while (dup > 0) {
            int lastDigit = dup % 10;
            sum += Math.pow(lastDigit, numberOfDigits);
            dup /= 10;
        }

        if (sum == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
