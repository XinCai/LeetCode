package datastructers;

import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,5,3,16,9,0,1};
        inserSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void inserSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int currentEle  = arr[i];
            int j = i;

            while (j>0 && currentEle < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = currentEle;
        }
    }


    /**
     * insert sort
     * @param arr
     */
    public static void insertSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;

            while (j>0 && current < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = current;
        }

    }


    public static void inserSort1(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int currentEle = arr[i];
            int j = i;

            while (j>0 && arr[j-1]>currentEle){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = currentEle;

        }
    }


}
