package datastructers;

public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
        // write your code here
        // duplicate number condition nums[i] != nums[i-1]
        // then increase pointer

        if (nums.length == 0 || nums == null){
            return 0;
        }

        int pointer = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        return pointer;

    }

    public static void main(String[] args) {
        int[] arr= {-10,0,0,0,0,0,1,2,3};
        removeDuplicates(arr);
    }
}
