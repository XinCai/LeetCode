package lintcode;

import java.util.*;

public class kthLargestinNArrays {

    public static void main(String[] args) {
        int[][] arr ={{},{11,9,20},{7,17,3},{},{3,17},{9,6,20,19,17},{15,4,0},{},{9,18,7}};
        KthInArrays1(arr,11);
    }

    public static int KthInArrays(int[][] arrays, int k) {
        // write your code here
        HashSet<Integer> set = new HashSet<Integer>();

        // remove duplicate number
        for (int i=0; i<arrays.length ; i++) {
            for (int j=0; j<arrays[i].length ; j++ ){
                set.add(arrays[i][j]);
            }
        }
        ArrayList<Integer> arrList = new ArrayList<Integer>(set);


        // descending order
        Collections.sort(arrList, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });

        return arrList.get(k-1);
    }

    public static int KthInArrays1(int[][] arrays, int k) {
        // write your code here
        Queue<Integer> pq = new PriorityQueue<Integer>();

        PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });


        for (int i=0; i<arrays.length ; i++) {
            for (int j=0; j<arrays[i].length ; j++ ){
                pq.offer(arrays[i][j]);
                if(pq.size() > k){
                    pq.poll();
                }
            }
        }

        return pq.poll();
    }

}
