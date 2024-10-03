package Array.Easy;
//41. First Missing Positive
//        Hard
//        Topics : Cyclic Sort
//        Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//
//        You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

public class FirstMissingPositive_LC41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        //Cyclic Sort
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index=0;index < nums.length;index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }

        return nums.length + 1;
    }
}
