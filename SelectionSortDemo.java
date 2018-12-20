package node;

public class SelectionSortDemo {
    public static void main(String[] args) {

        int[] myarr= {2,51,6,73,71,9};
        int[] myarr1= {9,8,7,6,5,4,3,2,1,0};
        int[] myarr2= {2,51,6,73,71,9};
        int[] result ;

        System.out.println("before selection sort");
        printArray(myarr1);
        result = selectionSort(myarr1);
        System.out.println("after selection sort");
        printArray(result);

    }

    public static int[] selectionSort(int[] arr){
        int[] res = arr;
        int i, j; // sorted array in the left , unsorted array in the right

        for (i=0; i< res.length;i++){

            //find min value element in the unsorted array,
            for (j= i+1; j<res.length; j++){
                if (res[i] > res[j]){
                    //swap the found min element with first element in the boundary
                    int temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
                }
            }
        }

        return  res;
    }

    public static void selectSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return ;
        int minIndex = 0;
        for(int i=0; i< arr.length-1; i++) { //只需要比较n-1次
            minIndex = i;
            for(int j=i+1; j<arr.length; j++) { //从i+1开始比较，因为minIndex默认为i了，i就没必要比了。
                if(arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) { //如果minIndex不为i，说明找到了更小的值，交换之。
                swap(arr, i, minIndex);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
