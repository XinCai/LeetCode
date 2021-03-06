package DataStructure;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2,5,16,26,0,22,17,3};
        MergeSort mergeSort  = new MergeSort();
        mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void mergeSort(int[] arr){
        if ( arr.length > 1){
            int middle = arr.length/2;

            int[] leftArray = Arrays.copyOfRange(arr,0,middle);
            int[] rightArray = Arrays.copyOfRange(arr,middle, arr.length);

            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(arr,leftArray, rightArray);
        }

    }

    private void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int totalLength = arr.length;
        int[] tmpArray = new int[totalLength];
        int tmpIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0 ;

        while (leftIndex< leftArray.length && rightIndex < rightArray.length){
            if (leftArray[leftIndex] <= rightArray[rightIndex]){
                tmpArray[tmpIndex] = leftArray[leftIndex];
                leftIndex++;
            }else {
                tmpArray[tmpIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            tmpIndex++;
        }

        while (leftIndex < leftArray.length){
            tmpArray[tmpIndex] = leftArray[leftIndex];
            tmpIndex++;
            leftIndex++;
        }

        while (rightIndex < rightArray.length){
            tmpArray[tmpIndex] = rightArray[rightIndex];
            tmpIndex++;
            rightIndex++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmpArray[i];
        }

    }
}
