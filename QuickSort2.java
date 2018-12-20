package BFS;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {


        int[] arr = {0,1,2,5,79,4,26,11,0};
        QuickSort2 quickSort2 = new QuickSort2();
        quickSort2.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int left, int right){
        if (left < right){
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex-1);
            quickSort(arr, partitionIndex+1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int partitionIndex = left;
        int tmp = 0;

        for (int i = left; i < right ; i++) {
            if (arr[i] <= pivot){
                tmp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = tmp;
                partitionIndex++;
            }
        }

        tmp = arr[partitionIndex];
        arr[partitionIndex] = arr[right];
        arr[right] = tmp;

        return partitionIndex;

    }
}
