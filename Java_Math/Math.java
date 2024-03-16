package Java_Math;

public class Math {
    public  static int countDigit(int n){
        int sum =0;
        while(n>0){
            sum = sum +1;
            n /= 10;
        }
        return sum;

    }


    public static void main(String []args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + countDigit(n));
    }
}
