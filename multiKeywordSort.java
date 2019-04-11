package lintcode;

import java.util.*;

class Pair{
    int id;
    int score;
    public Pair(int id, int score){
        this.id = id;
        this.score = score;
    }
}

public class multiKeywordSort {




    public static void main(String[] args) {
        int[][] arr = { {2,50},{1,50},{3,100}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }

        int[] nums = {25,5,12,6,126,1,6,1,612,61,2,4,124};


        multiSort(arr);

       // Arrays.sort(nums, );

        System.out.println(Arrays.toString(nums));

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] != o2[1] ){
                    return o2[1] - o1[1];
                }

                return o1[0] - o2[0];

            }
        });

        System.out.println(Arrays.deepToString(arr));


        PriorityQueue<Pair> priorityQueue = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.score != o2.score){
                    return o2.score - o1.score;
                }

                return o1.id - o2.id;
            }
        });

        for (int i=0; i<arr.length; i++){
            priorityQueue.offer(new Pair(arr[i][0],arr[i][1]));
        }

        int index =0 ;
        while (!priorityQueue.isEmpty()){
            Pair curr = priorityQueue.poll();
            arr[index] = new int[]{curr.id,curr.score};
        }


    }


    public static int[][] multiSort(int[][] array) {
        // Write your code here
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (!cmp(array[i], array[j])) {
                    int tmp = array[i][0];
                    array[i][0] = array[j][0];
                    array[j][0] = tmp;

                    tmp = array[i][1];
                    array[i][1] = array[j][1];
                    array[j][1] = tmp;
                }
            }
        }

        return array;
    }

    static boolean cmp(int[] a, int[] b) {
        if (a[1] > b[1]) {
            return true;
        }
        if (a[1] == b[1] && a[0] < b[0]) {
            return true;
        }
        return false;
    }

}
