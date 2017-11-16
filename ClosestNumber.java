package lintcode;


public class ClosestNumber {
    public static void main(String[] args) {
        ClosestNumber closestNumber = new ClosestNumber();

        int[] B = {1, 10, 15, 25, 35, 45, 50, 59};

        System.out.println("closest number index is : " + closestNumber.closestNumber(B, 30));
    }

    public int closestNumber(int[] A, int target) {
        // write your code here
        int i = 0;

        if (target > A[A.length - 1]) {
            return A.length - 1;
        }

        if (target < A[0]) {
            return 0;
        }

        for (; i < A.length; i++) {

            if (A[i] < target && target <= A[i + 1]) {
                if (target - A[i] >= A[i + 1] - target) {
                    return i + 1;
                }else if (target - A[i] < A[i + 1] - target){
                    return i;
                }
            }
        }

        return i;
    }
}

