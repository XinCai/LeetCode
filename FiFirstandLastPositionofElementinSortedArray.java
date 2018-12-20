package leetcode;

public class FiFirstandLastPositionofElementinSortedArray {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];

        result[0] = -1;
        result[1] = -1;
        if (nums == null){
            return result;
        }

        int start = 0;
        int end = nums.length -1;

        while (start+1<end){
            int mid = start + (end-start)/2;
            if (nums[mid] == target){

                result[0] = mid;
                result[1] = mid+1;
                return result;
            }
            if (nums[mid]>target){
                end = mid;
            }
            if (nums[mid]<target){
                start=mid;
            }
        }

        return result;
    }

}
