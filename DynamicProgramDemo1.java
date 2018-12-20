package node;

public class DynamicProgramDemo1 {
    /**
     * 找出数组里面 各种数字
     * 数组 arr = {1,2,4,1,7,8,3};
     *
     *
     * 1）选一些 不相临 的数字， 可选多个数字
     * 2）选好的这些数字 相加， 得出最大值
     *
     * @param args
     */
    public static void main(String[] args) {
        //int[] arr = {1,2,4,1,7,8,3};
        //int[] arr = {4,1,1,9,1};
        int[] arr = {6,3,8,9,1};
        System.out.println(recursion_opt(arr,4));
        System.out.println(dynamicPro_opt(arr));
    }

    /**
     * 使用 递归 来解决这个问题
     *
     * @param arr
     * @param arrIndex
     * @return
     */
    public static int recursion_opt(int[] arr, int arrIndex){

        int x = arrIndex;
        int A; // chose current position scenario
        int B; // not chose this current position scenario

        // 写递归， 首先 写退出 递归的条件

        if (x==0){ // 当 index 是 0  的时候，  取 arr[0], 返回值
            return arr[0];
        }else if (x==1){
            return Math.max(arr[0], arr[1]); // 当 index 是 1 ， 去 前面两个 数， arr[0] , arr[1] 的最大值
        }else {
            A = recursion_opt(arr,x-2) + arr[x]; // A 情况， 当选当前 数字， arr[current] , 递归
            B = recursion_opt(arr, x-1);
            return Math.max(A,B);
        }
    }

    /**
     * 使用  非递归的方法
     *
     * @param arr
     *
     * @return
     */
    public static int dynamicPro_opt(int[] arr){

        int[] opt = new int[arr.length];

        int A; // chose current position scenario
        int B; // not chose this current position scenario

        opt[0] = arr[0];
        opt[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            A = opt[i-2] + arr[i];
            B = opt[i-1];
            opt[i] = Math.max(A,B);
        }

        return opt[arr.length-1];
        }
    }





