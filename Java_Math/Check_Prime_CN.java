package Java_Math;
import java.util.Scanner;
public class Check_Prime_CN {

    public static String isPrime(int num) {
        int count =0;

        for(int i=1; i*i<=num;i++){
            if(num % i ==0){
                count ++;
                if(num/i != i ){
                    count ++;
                }
            }
        }
        if(count==2){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        num = sc.nextInt();

        isPrime(num);
    }
}
