import java.util.Scanner;

public class Sum_1_PS {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 3 Values : ");
        int a=s.nextInt();
        int b = s.nextInt();
        int c=s.nextInt();
        int sum = a + b + c;
        System.out.print("The Sum is : ");
        System.out.println(sum);

    }
}
