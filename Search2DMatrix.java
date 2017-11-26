package lintcode;

/**
 * Created by caixin on 26/11/17.
 *
 * 二维数组
 *
 * 数组里面的元素 ， 还是数组
 *
 * 考虑下面矩阵：
 *
 * [
 *
 * [1, 3, 5, 7],
 *
 * [10, 11, 16, 20],
 *
 * [23, 30, 34, 50]
 *
 * ]
 *
 * give target = 3, return true
 *
 * 矩阵 里面的数组个数 都是一样的
 *
 * 使用模版 进行 二分法 运算
 *
 *
 */
public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target){

        //矩阵 是 null 的情况
        if (matrix==null){
            return false;
        }

        //空矩阵
        if (matrix.length ==0){
            return false;
        }

        //column number is 0 时候， 说明 列数 为 0 ，则 矩阵 是 空
        if (matrix[0].length == 0 ){
            return false;
        }


        int startRow = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length -1;

        int row = -1;

        //使用二分法， 首先找到 目标 行
        while (startRow +1 < endRow){
            int mid = startRow + (endRow - startRow)/2;
            if (matrix[mid][endCol] < target){
                startRow = mid;
            }else{
                endRow = mid;
            }
        }

        //二分之后 ， 只剩下 2个 元素， startRow, endRow
        //在 进行判断
        // 首先 判断 startRow 的最后一个元素 ，是否 大于等于 target
        // 之后 判断 end
        if (matrix[startRow][endCol] >=target){
            row = startRow;
        }else if (matrix[endRow][endCol] >= target){
            row = endRow;
        }else {
            return false;
        }

        //找到 行 ， 在进行 这一行 其中的 列 的判断

        int startCol1 =0;
        int endCol1 = endCol;

        while (startCol1 + 1 < endCol1){
            int midCol = startCol1 + (endCol1-startCol1)/2;
            if (matrix[row][midCol]<target){
                startCol1 = midCol;
            }else{
                endCol1 = midCol;
            }
        }

        if (matrix[row][startCol1] == target) {
            return true;
        }else if(matrix[row][endCol1]==target) {
            return true;
        }else {
            return false;
        }

    }
}
