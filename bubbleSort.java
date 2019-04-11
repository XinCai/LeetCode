package datastructers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bubbleSort {

    /**
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void bubbleSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }



    public static void main(String[] args)
    {

        int[] arr= {2,6,21,0,4,11,51,14,67};
        int[] arr1= {2,2,2,0,4,4,5,4,67};

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);

        String s = "1";
        System.out.println(s.compareTo("2"));



        //bubbleSort(arr);
        bubbleSort1(arr1);

        System.out.println(Arrays.toString(arr1));
    }

}
