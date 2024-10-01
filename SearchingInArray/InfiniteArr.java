package SearchingInArray.SearchingInArray;

public class InfiniteArr {
    public static void main(String[] args) {
            int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
            int target = 15;

        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;

            // Since this questions is about Infinite array so we dont have to worry about IndexOutOfBound because whenever we double the end then at some point it goes outofBound
            // in that case we do this below check
            if(end >= arr.length){
                end = arr.length - 1;
                if(target > arr[end]){
                    return -1;
                }
            }
        }
        return BinarySearch(arr, target, start, end);

    }
    public static int BinarySearch(int numbers[], int target, int start  , int end){
        while(start<= end){
            int mid = start + (end - start) / 2;

            if(numbers[mid]== target){
                return mid;
            }
            else if(numbers[mid] > target){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
