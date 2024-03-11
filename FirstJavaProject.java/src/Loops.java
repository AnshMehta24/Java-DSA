
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        System.out.println("Enter any Number :");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        for (int i = 1; i <= num; i++) {
            // Print spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

