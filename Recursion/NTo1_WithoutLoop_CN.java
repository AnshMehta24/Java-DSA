package Recursion;
import java.util.Scanner;
public class NTo1_WithoutLoop_CN {

        public static int[] printNos(int x) {
            // Write Your Code Here
            int []arr = new int[x];

            arr = nToOne(x,  arr,0);
            return arr;
        }

        public static int[] nToOne(int x, int[]arr, int index){
            if(x==0){
                return arr;
            }
            else{
                arr[index] = x;
                nToOne(x-1, arr, index+1);
                return arr;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        printNos(x);
    }
    }

