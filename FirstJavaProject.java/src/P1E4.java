import java.util.Scanner;
public class P1E4 {
    public static int gcd(int num1,int num2)
    {
        while (num1!=num2)
        {
            if(num1>num2)
            {
                num1=num1-num2;
            }
            else
            {
                num2=num2-num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1=s.nextInt();
        System.out.println("Enter Second Number :");
        int num2=s.nextInt();
        System.out.printf("GCD of %d and %d is %d",num1,num2,gcd(num1,num2));
    }

}
