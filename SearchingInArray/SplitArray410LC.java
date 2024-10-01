package SearchingInArray.SearchingInArray;

//410. Split Array Largest Sum
// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//
//Return the minimized largest sum of the split.
//
//A subarray is a contiguous part of the array.
// HARD

// Amazon, Adobe, Google, Microsoft, Bloomberg, Facebook (Meta), Apple, Qualcomm, Hudson River Trading,  Uber, ByteDance, Goldman Sachs, etc..
public class SplitArray410LC {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }

    static int splitArray(int[] nums, int k) {
        int start =0;
        int end =0;

        for(int i=0;i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while(start < end){
            // try for middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum =0;
            int peices =1;

            for(int num : nums){
                if(sum + num > mid){
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    peices++;
                }else{
                    sum += num;
                }
            }

            if(peices > k){
                start = mid +1 ;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
