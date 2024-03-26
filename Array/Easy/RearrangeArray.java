package Array.Easy;
import java.util.Scanner;
public class RearrangeArray {
    public static void rearrangeArray(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){


            if(i % 2== 0){
                if(nums[i]< nums[i-1]){
                    // nums[i]
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }
            }
            else if(nums[i]>nums[i-1]){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1]= nums[i];
            }
        }
    }


}
