package datastructers;

import java.util.Arrays;

public class quickSort1 {

    public static void main(String[] args) {
        int[] arr = {0,2,52,1,27,13,8,12,5,2};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left , int right){
        if(left < right){
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex -1);
            quickSort(arr, partitionIndex+1, right);
        }
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];

        int partitonIndex = 0 ;

        for (int i=left; i < right; i++ ){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[partitonIndex];
                arr[partitonIndex] = temp;
                partitonIndex++;
            }
        }

        int temp = arr[right];
        arr[right] = arr[partitonIndex];
        arr[partitonIndex] = temp;

        return partitonIndex;

    }

//    public static void quickSort(int[] arr, int left, int right){
//
//        if (left < right) {
//            int partitionIndex = partition(arr, left, right);
//            quickSort(arr, 0, partitionIndex - 1);
//            quickSort(arr, partitionIndex+1, right);
//        }
//
//    }
//
//    private static int partition(int[] arr, int left, int right) {
//        int partitionIndex = left;
//
//        int pivot = arr[right];
//
//        for (int j = left; j < right; j++) {
//            if (arr[j] <= pivot){
//                int tmp = arr[j];
//                arr[j] = arr[partitionIndex];
//                arr[partitionIndex] = tmp;
//                partitionIndex++;
//            }
//        }
//
//        int temp = arr[right];
//        arr[right] = arr[partitionIndex];
//        arr[partitionIndex] = temp;
//
//        return partitionIndex;
//    }
}
