package DataStructure;

/**
 * selection sort(选择排序)
 *
 * 选择排序（Selection sort）是一种简单直观的排序算法。
 * 它的工作原理如下。
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 *
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，
 *
 * 然后放到已排序序列的末尾。
 *
 * 以此类推，直到所有元素均排序完毕。
 *
 * 选择排序的主要优点与数据移动有关。
 *
 * 如果某个元素位于正确的最终位置上，则它不会被移动。
 *
 * 选择排序每次交换一对元素，它们当中至少有一个将被移到其最终位置上，
 * 因此对 n个元素的表进行排序总共进行至多  n-1 次交换。
 *
 * 在所有的完全依靠交换去移动元素的排序方法中，选择排序属于非常好的一种。
 *
 * 分类	排序算法
 *    数据结构	數組
 *    最坏时间复杂度	О(n²)
 *    最优时间复杂度	О(n²)
 *    平均时间复杂度	О(n²)
 *    空间复杂度	О(n) total, O(1) auxiliary
 *
 * steps:
 * move the pointer to the right
 * identify index of minimum entry on right
 * exchange into position
 *
 * 在第i次迭代中，在剩下的(即未排序的)元素中找到最小的元素
 * 将第i个元素与最小的元素交换位置
 *
 * Time: 比较次数 O(n^2)
 *
 */
public class SelectionSortDemo {

    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};

        System.out.println("Before selection sort");
        for (int i= 0; i< arr1.length; i++) {
            System.out.print(arr1[i]+ " ");
        }
        selectionSort(arr1);

        System.out.println();

        System.out.println("After selection sort");

        for (int i=0; i<arr1.length;i++) {
            System.out.print(arr1[i]+ " ");
        }

    }

    /**
     * selection sort
     * @param arr
     * @return
     */
    public static int[] selectionSort(int[] arr){
        int i;
        int j;
        int minValue;
        int minIndex;
        int temp;

        //outer loop
        for (i=0;i<arr.length;i++){

            //start from index 0,

            // assign mini value = arr[0]
            // assign , mini index = 0

            // this is a pointer , which always point to smallest value
            // key point is here !
            minValue = arr[i];
            minIndex = i;

            //inner loop
            // start from 0, j = 0
            // find the following smallest value in the rest of array
            for (j=i;j<arr.length;j++){
                // arr[0] = arr[0] (minValue), skip first condition statement

                // arr[i] < arr[0] (minValue), if true, change minValue and minIndex

                if (arr[j] < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            // compare current value with smallest value in the rest of array, if smaller than current, swap value
            if (minValue < arr[i]){
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
        /*for (int i=0; i < arr.length; i++){

            int index = 1; // pointer

            for (int j= i+1; j < arr.length; j++){
                //identify index of minimum entry on right

                //if right hand side value is greater than arr[j], then assign index to j (right hand index)
                if (arr[j] < arr[index]){
                    index = j; // searching for lowest index
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }*/
    }
}
