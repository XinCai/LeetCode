package leetcode;

public class BinarySearch {

    public static void main(String[] args) {
        //int[] arr = {-1,0,3,5,9,12};
        int[] arr = {2,5,6,8,10};
        System.out.println(search(arr,5));
    }


    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while (start + 1 < end ){
            mid = start + (end - start)/2;

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                start = mid;
            }else if (nums[mid] > target){
                end =mid;
            }
        }

        if (nums[start] == target) {
            return start;
        }

        if (nums[end] == target){
            return end;
        }

        return -1;
    }

}
