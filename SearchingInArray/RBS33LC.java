package SearchingInArray.SearchingInArray;

//33. Search in Rotated Sorted Array

//Google
//Amazon
//Microsoft
//Facebook (Meta)
//Uber
//Apple

public class RBS33LC {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,6 ));
    }

    static int search(int[] arr, int  target){
        int pivot = findPivot(arr);

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
    static int findPivot(int[] arr ){
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

                if(arr[mid] <= arr[start]){
                    end = mid - 1;
                }else{
                    start  = mid + 1;
                }
            }
            return -1;
    }
}
