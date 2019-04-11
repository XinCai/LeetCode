package Leetcode;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length ==0 ){
            return 0;
        }
        int currIndex = 0 ;

        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                int tmp = nums[i];
                nums[i] = nums[currIndex];
                nums[currIndex] = tmp;
                currIndex++;
            }
        }

        return currIndex;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;

        removeElement(arr,2);


    }

}
