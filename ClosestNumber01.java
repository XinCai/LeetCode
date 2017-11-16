package lintcode;

/**
 * Created by KXC176 on 16/11/2017.
 */
public class ClosestNumber01 {

    /**
     * binary search
     *
     *  样例
     *  [1, 2, 3] target = 2, 返回 1.
     *  [1, 4, 6] target = 3, 返回 1.
     *  [1, 4, 6] target = 5, 返回 1 或者 2.
     *  [1, 3, 3, 4] target = 2, 返回 0 或者 1 或者 2.
     *
     * @param A
     * @param target
     * @return
     */
    public int closestNumber(int[] A, int target){
        if (A.length == 0) {
            return -1;
        }

        int start = 0 ;
        int end = A.length - 1; // length and index relation , have to minus 1

        while (start+1 < end){
            int mid = start + (end - start)/2; // why (end - start)/2?  => take mid value

            if (A[mid] == target){
                return mid;
            }




        }


    }
}
