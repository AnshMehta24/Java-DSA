import java.util.Scanner;
public class P1E5  {
    public static void main(String[] args) {
        long num,reversed=0;
        System.out.println("Enter Number :");
        Scanner s=new Scanner(System.in);
        num=s.nextLong();
        while(num!=0)
        {
            long digit=num%10;
            reversed=reversed * 10 + digit;
            num=num/10;
        }
        System.out.println("Reversed Number is ");
        System.out.println(reversed);
    }
}
