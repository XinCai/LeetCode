package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {


    public static void main(String[] args) {
        int[] arr = {3,2,3};
        //majorityElement(arr);
        majorElement(arr);
    }
    public static int majorityElement(int[] nums) {
        int majNum = nums.length / 2;
        int result = nums[0]; // init the result
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count>=majNum){
                result = nums[i];
                return result;
            }
        }

        return result;
    }

    public static int majorElement(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();
        int result = nums[0];

        for (int num : nums ) {
            if (!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }

            if (map.get(num)> nums.length/2){
                result = num;
                break;
            }
        }

        return result;




    }

}
