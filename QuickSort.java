package DataStructure;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,65,26,2,12,25,73,9};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int start, int end){
        if (start < end ){
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition -1);
            quickSort(arr, partition+1,end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int partitionIndex = start;
        int leftIndex = start;

        int tmp = 0;
        for (int i = leftIndex; i < end ; i++) {
            if (arr[i] < pivot){
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
}
