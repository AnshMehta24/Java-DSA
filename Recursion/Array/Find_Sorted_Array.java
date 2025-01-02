package Recursion.Array;

public class Find_Sorted_Array {

    public static  boolean SortedArray(int[] arr){
//        Base Condition
       return helper(arr, 0);
    }

    public static boolean helper(int[] arr, int index){
        if(arr.length-1 == index){
            return true;
        }

        return arr[index] < arr[index+1] && helper(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 5};
        System.out.println(SortedArray(arr));
    }
}
