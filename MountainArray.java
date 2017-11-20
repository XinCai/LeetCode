package lintcode;

public class MountainArray {

    public int mountainSequence(int[] nums){
        // write your code here

        int length = nums.length;
        if(length==1){
            return nums[0];
        }
        if (nums[0] > nums[1]){
            return nums[0];
        }

        int i;
        for (i = 1; i< length; i++){
            if (nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                return nums[i];
            }else {
                continue;
            }
        }

        return nums[i];
    }
}
