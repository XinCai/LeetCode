package leetcode;

public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0){
            return 0;
        }

        int left = 0;
        int right = Integer.MAX_VALUE;

        while (left + 1 < right){
            int mid = left + (right - left)/2;

            if (mid > x/mid){

            }


        }
        return -1;
    }

}
