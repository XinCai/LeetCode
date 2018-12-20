package leetcode;

public class FinFirstandLastPositionofElementinSortedArray {


    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(searchRange(arr,8)[0]);
        System.out.println(searchRange(arr,8)[1]);
    }

    /**
     *
     *
     *
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     *
     *
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        if (nums == null || nums.length<1){
            return result;
        }

        result[1] = findRightMostIndex(nums, target);
        result[0] = findLeftMostIndex(nums,target);

        return result;
    }

    private static int findRightMostIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int indx = -1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }

            if (arr[start] == target) {
                indx = start;
            }

        }
            return indx;
    }


    private static int findLeftMostIndex(int[] arr, int target){
        int indx = -1;
        int end = arr.length - 1;
        int start = 0;

        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if (arr[mid] >= target){
                end= mid;
            }else {
                start = mid;
            }
        }

        if (arr[end] == target){
            indx = end;
        }

        return indx;
    }

}
