package datastructers;

import java.util.Arrays;

public class selectionSort {
    //miniIndex,

    public static void selectionSort(int[] arr){
        int miniIndex;
        for (int i = 0; i < arr.length; i++) {
            miniIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j]< arr[miniIndex]){
                    miniIndex = j;
                }
            }
            swap(i,miniIndex,arr);
        }
    }

    private static void swap(int i, int miniIndex, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[miniIndex];
        arr[miniIndex] = tmp;
    }



    public static void selectionSort1(int[] arr){
        int miniIndex;

        for (int i = 0; i < arr.length; i++) {
            miniIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[miniIndex]){
                    miniIndex = j;
                }
            }

            int tmp  = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,7,33,9,2,0};
        System.out.println(Arrays.toString(arr));
        //selectionSort(arr);
        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));


    }
}
