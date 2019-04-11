package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class removeDuplicateNumbersInArray {

    /**
     * two pointers classic questions
     *
     * @param arr
     * @return
     */
    public int duplicateRemove(int[] arr){
        int resIndex = 0;

        // sorting first
        Arrays.sort(arr);
        ArrayList<Integer> list  = new ArrayList<Integer>();
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

    return  1;

    }

    public static void main(String[] args) {
        int a = 4;
        int b = a>>1;
        int c = b>>1;
        System.out.println(c);


        StringBuilder sb = new StringBuilder();
        sb.reverse();
    }
}
