package Recursion;

public class ReverseA_Number {
    public  static void rev(int n){
        if(n == 0){
            return ;
        }

        System.out.println(n % 10);
        rev(n / 10);
    }

    public static void main(String[] args) {
        rev(1234678910);
    }
}
