package leetcode;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] arr2 = {1,0,2,0,3,0,4,5,6};
        moveZeros2(arr2);
    }

    public static void moveZeroes(int[] nums) {
        int counter = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                int tmp = nums[nums.length-1-i];
                nums[nums.length-1] = 0;
                nums[i] = tmp;
                counter++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j){
        int tmp=0;

        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

    public static void moveZeros1(int[] nums){
        for (int i = 0; i < nums.length; i++) {
             if (nums[i]==0){
                 for (int j = 1; j < nums.length - 1 && i+j<nums.length; j++) {
                     if (nums[i+j] !=0){
                         int tmp = nums[i];
                         nums[i] = nums[i+j];
                         nums[i+j] = tmp;
                         break;
                     }
                 }
             }
        }

    }

    public static void moveZeros2(int[] nums){
        int leftPointer =0;
        int rightPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ){
                int temp = nums[i];
                nums[i] = nums[leftPointer];
                nums[leftPointer] = temp;
                leftPointer++;
            }
        }

    }



}
