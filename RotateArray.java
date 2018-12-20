package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RotateArray {

    public static void main(String[] args) {

         int[] arr = {1,2,3,4,5,6,7};

         int[] arr1= {1,2};
         int k =3 ;

        System.out.println(3%2);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,3,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        rotate1(arr,4);

    }

    public static void rotate1(int[] nums, int k) {
        int n = nums.length;
        if(nums == null || nums.length < 2){
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    public static void rotate(int[] nums, int k) {
        if (nums.length<k){
            return;
        }
        int[] result = new int[nums.length];


        for (int i = k ; i >0 ; i--) {
            System.out.println(nums[nums.length-i]);
            result[k-i] = nums[nums.length-i];
        } // first k number


        for (int i = 0; i < nums.length - k; i++) {
            result[k+i] = nums[i];
            System.out.println(result[k+i]);
        }

        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }


    }


    public static void reverse(int[] nums, int i, int j){

        int tmp =0;
        while (i < j){
             tmp = nums[i];
             nums[i] = nums[j];
             nums[j] = tmp;
             i++;
             j--;
        }

    }
}
