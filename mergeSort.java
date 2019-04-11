package datastructers;

import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {

    }

    public void mergeSort(int[] arr){
        if (arr.length == 0){
            return;
        }

        if (arr.length>1) {


            int middle = arr.length / 2;

            int[] leftArray = Arrays.copyOfRange(arr, 0, middle); // "to" exclusive, copy range from (0 to middle-1)
            int[] rightArray = Arrays.copyOfRange(arr, middle, arr.length);  //  copy range from (middle to arr.length -1)

            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(arr,leftArray,rightArray);
        }
    }

    private void merge(int[] arr, int[] leftArray, int[] rightArray) {

    }
}
