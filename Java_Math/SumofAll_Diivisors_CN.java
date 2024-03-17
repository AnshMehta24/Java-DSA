package Java_Math;
import java.util.Scanner;
import java.lang.Math;
public class SumofAll_Diivisors_CN {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        long[] sumOfDiv = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sumOfDiv[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            if (sumOfDiv[i] == 1) { // i is prime
                for (int j = i; j <= n; j += i) {
                    int p = i;
                    int exponent = 0;
                    while (j % p == 0) {
                        p *= i;
                        exponent++;
                    }
                    sumOfDiv[j] *= (Math.pow(i, exponent + 1) - 1) / (i - 1);
                }
            }
        }

        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += sumOfDiv[i];
        }

        // Check for overflow
        if (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) {
            return (int) result;
        } else {
            // Handle overflow
            return Integer.MIN_VALUE; // Example of handling overflow by returning a special value
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sumOfAllDivisors(n);
    }
}
