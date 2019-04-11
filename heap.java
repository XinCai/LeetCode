package lintcode;

import java.util.Arrays;

public class heap {


    public static void main(String[] args) {
        int[] arr = {5,21,2,1,61,17,12,1,23,12,31,221};

        heapify(arr);

        System.out.println(Arrays.toString(arr));

        print(arr);
    }

    /**
     * return parent index
     * @param arr
     * @param childNodeIndex
     * @return
     */
    private int parent(int[] arr, int childNodeIndex){
        int parentIndex = (childNodeIndex -1 )/2;
        if(parentIndex > 0){
            return parentIndex;
        }
        return -1;
    }

    public static void print(int[] arr)
    {
        for (int i = 1; i <= arr.length / 2; i++) {
            System.out.print(" PARENT : " + arr[i] + " LEFT CHILD : " +
                    arr[2 * i] + " RIGHT CHILD :" + arr[2 * i + 1]);
            System.out.println();
        }
    }

    /**
     *  heap = arr
     *
     *  leftChild = 2i +1
     *  rightChild = 2i +2
     *  parent = (i-1)/2
     *
     * @param arr
     * @param currNodeIndex
     * @return
     */
    private boolean isleaf(int[] arr, int currNodeIndex){
        int leftChildIndex = 2*currNodeIndex + 1;
        //int rightChild = 2*currNodeIndex +2 ;
        if(leftChildIndex > arr.length-1){
            return true;
        }else {
            return false;
        }
    }

    public static void heapify(int[] arr){
        for (int i=0; i< arr.length; i++){
            siftUp(arr, i);
        }
    }

    public static void siftUp(int[] arr, int index){
        while(index>0){
            int parent = (index - 1)/2;
            if( arr[index] > arr[parent]){
                break;
            }

            int temp = arr[parent];
            arr[parent] = arr[index];
            arr[index] = temp;

            index = parent;
        }
    }







}
