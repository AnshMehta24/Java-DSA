package Recursion;

public class SelectionSort {

    public static void ssSort(int[] arr, int row, int col, int max){
        if(row == 0){
            return;
        }
        if(col < row){

            if(arr[col] > arr[max]){
                ssSort(arr, row, col+1, col);
            }else{
                ssSort(arr, row, col+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            ssSort(arr, row -1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr =  {4,3,2,1};
        ssSort(arr, arr.length, 0,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
     }
}
