package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k = 2;

        int[] arr1 = {1,2,3,1};


 //       System.out.println(containsNearbyDuplicate(arr,2));
//        System.out.println(containDuplicate(arr1,3));
        System.out.println(containDupli(arr1,2));

    }

    public  static boolean  containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+ 1; j-i <=k && j< nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containDuplicate(int[] nums,int k){
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public static boolean containDupli(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            if(map.get(nums[i]) != null){
                if((i+ map.get(nums[i])) <=k){
                    return true;
                }
            }
            map.put(nums[i],i);

        }

        return false;
    }
}
