package Recursion;

public class SumOfN_Digits {
    public  static int sumOfNDigit(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + sumOfNDigit(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNDigit(1342));
    }
}
