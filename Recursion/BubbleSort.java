package Recursion;

public class BubbleSort {
    public static void bbSort(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){

            if(arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bbSort(arr,  row, col+1);
        }else{
            bbSort(arr, row -1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bbSort(arr, arr.length-1, 0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
