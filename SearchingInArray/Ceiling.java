// Q : Find the "smallest" element in the array that is "Greater than Or = target"
package SearchingInArray.SearchingInArray;

public class Ceiling {
    public static void main(String[] args) {
            int[] arr = {2,3,5,9,14,16,18};
            int target = 15;

            int ans = CeilingNumber(arr, target);
        System.out.println(ans);
    }

    static int CeilingNumber(int[] arr, int target){


            int start = arr[0];
            int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }

            while (start <= end){
                int mid = start + (end - start) / 2;

                if(target > arr[mid]){
                    start = mid + 1;
                }else if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    return arr[mid];
                }
            }

            return arr[start];
    }
}
