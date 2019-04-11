package Leetcode;

import java.util.HashSet;

public class removeDuplicate {

    /**
     *
     * use extra space
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return set.size();
    }


    /**
     * remove in place
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates1(int[] nums){
        if (nums.length ==0){
            return 0;
        }
        if (nums.length == 1){
            return 1;
        }

        int res = 1; // start compare with next index value

        for (int j = 1; j <nums.length; j++) {
            if (nums[j]!= nums[j-1]){
                nums[res] = nums[j];
                res++;
            }
        }

        return res;

    }


    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,3,4};

        System.out.println( removeDuplicates1(arr));

    }
}
