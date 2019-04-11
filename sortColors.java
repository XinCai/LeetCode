package lintcode;

public class sortColors {

    public static void main(String[] args) {
        int[] arr = {2,0,0,1,2,0,2};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        // write your code here

        if(nums.length ==0 || nums == null){
            return;
        }

        int left = 0 ;
        int right = nums.length -1;
        int i = 0 ;

        while(left < right){
            if(nums[i] == 0){
                swap(nums,i,left);
                left++;
                i++;
            }else if(nums[i] == 1){
                i++;
            }else if(nums[i] == 2){
                swap(nums,i,right);
                right--;
                //   i++;
            }
        }


    }

    public static void swap (int[] arr, int i, int j ){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
