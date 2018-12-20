package leetcode;

import java.util.HashSet;

public class MissingNumber {

    public static void main(String[] args) {
        int res = 2 ;

        res = res ^ 2 ^ 1;

        System.out.println(res);

        int[] arr = {3,0,1};


        missingNumber(arr);
    }


    public static int missingNumber(int[] nums) {
        int res = nums[nums.length-1];
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }
}
