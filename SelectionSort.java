package DataStructure;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {6,12,7,1,9,3,8};

        System.out.println(Arrays.toString(selectSort(arr)));
    }

    public static int[] selectSort(int[] arr){
        if (arr == null || arr.length ==1){
            return arr;
        }

        int minValue = 0;
        int minIndex = 0;
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            minValue = arr[i];
            minIndex = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j]<minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}
