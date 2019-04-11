package datastructers;

import java.util.Arrays;

public class SortingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {4,5,15,61,63,7,7,41,2,3,2,2,1,0, -1,-3};
        //bubbleSort(arr);
        //selectionSort(arr);
        mergeSort(arr);
         //quickSort(arr, 0 , arr.length -1);
        //bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right){

        if (left < right){
            int partitionIndex = partition(arr, left,right);
            quickSort(arr,left, partitionIndex -1);
            quickSort(arr, partitionIndex+1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int partitionIndex = left ;
        int pivot = arr[right];

        for (int i = left; i < right ; i++) {
            if (arr[i] < pivot){
                int temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }

        int temp = arr[right];
        arr[right] = arr[partitionIndex];
        arr[partitionIndex] = temp;

        return partitionIndex;
    }


    public static void mergeSort(int[] arr){

        if (arr.length == 0 || arr == null){
            return;
        }
        if(arr.length>1){
            int middle = arr.length / 2;
            int[] leftArray = Arrays.copyOfRange(arr, 0, middle);
            int[] rightArray = Arrays.copyOfRange(arr, middle, arr.length);

            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(arr, leftArray, rightArray);
        }
    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int[] tempArr = new int[arr.length];
        int left = 0 ;
        int right = 0;
        int tmpIndex = 0 ;

        while(left < leftArray.length && right<rightArray.length){
            if(leftArray[left] < rightArray[right]){
                tempArr[tmpIndex] = leftArray[left];
                tmpIndex++;
                left++;
            }else {
                tempArr[tmpIndex] = rightArray[right];
                tmpIndex++;
                right++;
            }
        }

        while (left < leftArray.length){
            tempArr[tmpIndex] = leftArray[left];
            tmpIndex++;
            left++;
        }

        while (right < rightArray.length){
            tempArr[tmpIndex] = rightArray[right];
            tmpIndex++;
            right++;
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempArr[i];
        }

    }

    public static void bubbleSort(int[] arr){

        if(arr.length ==0 ){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

    }

    public static void selectionSort(int[] arr){

        if (arr.length == 0){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int miniIndex = i ;
            for (int j = i; j < arr.length; j++) {
                if (arr[miniIndex] > arr[j]){
                    miniIndex = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = tmp;
        }

    }




}
