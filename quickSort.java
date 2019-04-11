package datastructers;

import java.util.Arrays;

public class quickSort {


    public static void main(String[] args) {
        int[] arr = {0,2,52,1,27,13,8,12,5,2};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr , int start, int end){
        if (start < end){
            int pivotIndex = partition1(arr, start, end);
            quickSort(arr, start, pivotIndex -1 );
            quickSort(arr, pivotIndex + 1 , end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int partitionIndex = start;

        int tmp ;

        for (int i = start; i < end ; i++) {
            if (arr[i] <= pivot){
                tmp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = tmp;
                partitionIndex++;
            }
        }

        tmp = arr[partitionIndex];
        arr[partitionIndex] = arr[end];
        arr[end] = tmp;

        return partitionIndex;

    }

    private static int partition1(int[] arr, int start, int end){
        int pivot = arr[end];
        int partitionIndex = start;
        int tmp=0;

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot){
                tmp = arr[i];
                arr[i]= arr[partitionIndex];
                arr[partitionIndex] = tmp;
                partitionIndex++;
            }
        }

        tmp =  arr[partitionIndex];
        arr[partitionIndex] = arr[end];
        arr[end] = tmp;

        return partitionIndex;

    }
}
