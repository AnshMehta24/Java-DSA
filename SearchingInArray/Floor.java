// Q : Find the "Greatest" element in the array that is "Smaller than Or = target"
package SearchingInArray.SearchingInArray;

public class Floor {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;

        int ans = FloorNumber(arr, target);
        System.out.println(ans);
    }

    static int FloorNumber(int[] arr, int target){
        int start = arr[0];
        int end = arr.length - 1;

        if(target < arr[start]){
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

        return arr[end];
    }
}
