package leetcode;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class sum3Closest {

    public static void main(String[] args) {
        System.out.println( Math.abs(-100) );
        System.out.println(Math.abs(4));
        System.out.printf(String.valueOf("bbbbaaa".indexOf("aa")));
    }


    /**
     * Given array nums = [-1, 2, 1, -4], and target = 1.
     *
     * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {

        if (nums.length < 3){
            return 0;
        }

        int result = nums[0] + nums[nums.length/2] + nums[nums.length-1];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i+1;
            int end = nums.length - 1;
            int sum = 0;
            while (start < end){
                 sum = nums[i] + nums[start] + nums[end];
                if (sum > target){
                    end--;
                }else {
                    start++;
                }
                if ( sum - target < result - target){
                    result = sum;
                }

            }
        }

        return result;

    }
}
