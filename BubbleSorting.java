package Algithorm;

/**
 * Created by caixin on 21/11/17.
 */
public class BubbleSorting {
    
    
    /**
    * 从小到大 排序 
    *
    */
    
      public static void bubbleSort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j]>=arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

    }

    /**
     * sorting array
     *
     * order
     * 由大到小 排序
     *
     * @param arr
     */
    public void BubbleSort(int[] arr){
        int i,j,temp;

        for (i = 0; i < arr.length -1; i++) {

            for (j = i +1; j <arr.length ; j++) { // 遍历数组， 到最后一个位置
                if (arr[i] < arr[j]){  //arr[i] 和 之后的所有的元素比较， 把小于的数 放到后面位置
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSorting bubbleSorting = new BubbleSorting();
        int[] myArr= {2,6,4,8,9};

        bubbleSorting.BubbleSort(myArr);

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}
