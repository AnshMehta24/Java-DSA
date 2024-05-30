package Array.Easy;
import java.util.Scanner;
public class TwoDArray {

    public static void main(String[] args) {
        int matrix [][] =new int[3] [3];
    int n =matrix.length , m=matrix[0].length;
        Scanner sc = new Scanner(System.in);

//        input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] =  sc.nextInt();
            }
        }

//        output
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }

        }
        System.out.println("largest = " + largest + " smallest = " + smallest);
    }
}
