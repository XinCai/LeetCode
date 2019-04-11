package lintcode;

import java.util.*;

public class heapify {

    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4,7};
        heapify(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList arrayList = new ArrayList();
        arrayList.contains(1);
        Collections.sort(arrayList, Collections.reverseOrder());

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(7);
        set.add(1);
        set.add(10);

        System.out.println("set size " + set.size());

        ArrayList<Integer> arrayList1 = new ArrayList<>(set);
        Collections.sort(arrayList1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(arrayList1);


    }

    public static void heapify(int[] arr){
//        for (int i = arr.length/2 ; i >=0 ; i--) {
//            siftDown(arr,i);
//        }

        for (int i = 0; i < arr.length; i++) {
            siftUp(arr, i);
        }
    }


    /**
     * mini heap
     *
     *
     * This cost O(nlogn)
     * @param A
     * @param k
     */
    private static void siftUp(int[] A, int k){
        while (k > 0) {
            int father = (k - 1) / 2;
            if (A[k] > A[father]) {
                break;
            }
            int temp = A[k];
            A[k] = A[father];
            A[father] = temp;

            k = father;
        }
    }


    /**
     * mini heap
     * O(n)
     *
     * @param A
     * @param k
     */
    private static void siftDown(int[] A, int k) {
            while (k < A.length){
                int smallest = k;
                if(k*2+1 < A.length && A[k*2+1] >= A[smallest]){   // change to A[k*2+1] <= A[biggest] , became Max Heap
                    smallest = k*2+1;
                }

                if(k*2+2 < A.length && A[k*2+2] >= A[smallest] ){ // change to A[k*2+2] <= A[biggest] , became Max Heap
                    smallest = k*2+2;
                }

                if(smallest == k){
                    break;
                }

                int temp = A[smallest];
                A[smallest] = A[k];
                A[k] = temp;

                k = smallest;
            }
    }
}
