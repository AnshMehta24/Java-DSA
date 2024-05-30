package Array.Easy;

public class PrintSubArray {

    public  static  void printsubarr(int num[]){
        int ts=0;

        for(int i=0;i<num.length;i++){
           for(int j=i;j<num.length;j++)
           {
               int sum=0;
               for(int k=i;k<=j;k++){
                  sum += num[k];
                   System.out.print(num[k]+ " ");
               }
               System.out.print(" = "+sum);
               ts++;
               System.out.println();
           }
            System.out.println();
        }
        System.out.println("Total sum = "+ts);
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};

        printsubarr(num);
    }
}
