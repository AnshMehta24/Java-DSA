package Recursion;
import java.util.Scanner;
public class FactorialOf_N_Numbers {
    public  static  int factorial(int n){
        int factorial = 1;

        if(n==0) return 0;
        if(n==1) return factorial;
        return n * factorial(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}


