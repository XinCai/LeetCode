package lintcode;


/**
 * Created by caixin on 28/11/17.
 *
 * n! 阶乘计算， 使用递归来计算
 *
 * n!=1×2×3×...x(n-1)×n
 *
 * 递归表达：
 * 0!=1，
 * n!=(n-1)!×n
 *
 */
public class RecursionDemo {

    public int caculatFat(int num){
        if (num == 1) {
            return 1;
        }

        return num * caculatFat(num-1);
    }

    public static void main(String[] args) {
        RecursionDemo recursionDemo = new RecursionDemo();
        System.out.println(recursionDemo.caculatFat(3));
    }
}

