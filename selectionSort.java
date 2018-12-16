package alogrithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {12,11,0,6,3,8,89,2,2,2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] selectSort(int[] nums){
        if (nums== null || nums.length==0){
            return nums;
        }

        int minValue =0;
        int minIndex =0;
        int tmp=0;

        for (int i = 0; i < nums.length; i++) {
                minValue = nums[i];
                minIndex = i;
            for (int j = i; j < nums.length ; j++) {
                if (nums[j]< minValue){
                    minValue = nums[j];
                    minIndex = j;
                }
            }

            //if (nums[i] > minValue){
                tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;
            //}

        }

        return nums;

    }
}
