import java.util.Scanner;
public class BMI_Measure {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Weight in Pounds : ");
        float w = s.nextFloat();
        System.out.println("Enter Your Height in Inches : ");
        float h = s.nextFloat();
        float Kg = w * .45359237f;
        float Mtr = h * .0254f;
        float M = Mtr * Mtr;
        float BMI = Kg / M;
        System.out.print("Your BMI is : ");
        System.out.println(BMI);

    }
}
