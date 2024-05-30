package Array.Easy;

public class MaxSubArray {
    public  static  void maxsubarr(int num[]){
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix []= new int[num.length];

        //calculate prefix Array
        prefix[0] = num[0];
        for(int i=1;i<prefix.length;i++){
                prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++)
            {
                sum=i == 0? prefix[j] : prefix[j]-prefix[i-1];
//                for(int k=i;k<=j;k++){
//                    sum += num[k];
////                    System.out.print(num[k]+ " ");
//
//                }
//                System.out.print(" = "+sum);


//             using prefix

                System.out.println(sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }

        System.out.println("MAx Sum is"+maxSum);
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};

        maxsubarr(num);
    }
}
