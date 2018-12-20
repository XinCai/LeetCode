package node;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {4,2,15,7,8,3,9,19};
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        int[] arr2 = {20,15,16,37,1,6,2};
        quickSort1(arr1, 0, arr1.length-1);
        //quickSort1(arr2, 0, arr2.length-1);

        System.out.println(arr1.toString());


    }

    public static void quickSort1(int[] arr, int left, int right){

        int i = left; // left part , i is left pointer, move i from left to right
        int j = right-1; // right part , j is right pointer , move j from right to left

        if (right - left < 2){
             return ; // when there is 0 or 1 element in array, just return this array
        }else{
            //int pivot = arr[(left+right)/2]; // right == pivot
            int pivot = arr[right]; // right == pivot

            while (i<=j){
                while (arr[i] < pivot){
                    i++; // compare left part with pivot , if less than pivot , increase i pointer, move to next one
                }
                while (arr[j] > pivot){
                    j--;  // compare right part with pivot, if
                }
                if (i < j){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }else {
                    break;
                }
            }

            int pivotSwapTemp; // swap pivot from right end to i position
            pivotSwapTemp = arr[i];
            arr[i] = arr[right];
            arr[right] = pivotSwapTemp;
        }
        quickSort1(arr, left, i-1);
        quickSort1(arr, i+1, right);
    }

//     static int partition(int arr[], int left, int right)
//    {
//
//        int i = left, j = right;
//
//        int tmp;
//
//        int pivot = arr[(left + right) / 2];
//
//        while (i <= j) {
//
//            while (arr[i] < pivot)
//
//                i++;
//
//            while (arr[j] > pivot)
//
//                j--;
//
//            if (i <= j) {
//
//                tmp = arr[i];
//
//                arr[i] = arr[j];
//
//                arr[j] = tmp;
//
//                i++;
//
//                j--;
//
//            }
//
//        };
//
//
//
//        return i;
//
//    }

//    static void quickSort(int arr[], int left, int right) {
//
//        int index = partition(arr, left, right);
//
//        if (left < index - 1)
//        {
//            quickSort1(arr, left, index - 1);
//        }
//
//        if (index < right) {
//            quickSort1(arr, index, right);
//        }
//
//    }




}
