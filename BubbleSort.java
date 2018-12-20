package DataStructure;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,1,76,0,2,3};
        System.out.println("before" + Arrays.toString(arr));

        System.out.println("after" + Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr.length - 1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;

    }
}
