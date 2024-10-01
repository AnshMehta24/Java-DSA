package SearchingInArray.SearchingInArray;

//81. Search in Rotated Sorted Array II with Duplicate Elements
public class RBS81LC {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println(search(arr,5 ));
    }

    static int search(int[] arr, int  target){
        int pivot = findDuplicatePivot(arr);

        if(pivot ==  -1){
            // return normal Binary Search
            return BinarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return BinarySearch(arr, target, 0, pivot - 1);
        }
        return BinarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int BinarySearch(int numbers[], int key, int start, int end){
        while(start<= end){
            int mid = (start + end) / 2;

            if(numbers[mid]== key){
                return mid;
            }
            else if(numbers[mid] > key){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }

    static int findDuplicatePivot(int[] arr ){
        int start =0;
        int end = arr.length -1;
        while(start <=end){
            int mid = start + (end - start ) / 2;

            // 4 cases
            if(mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            //  if element on the middle , start, end are equal than just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(start < end && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // chech whether end is pivot
                if(end > start && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be on the right side
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end] )){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
