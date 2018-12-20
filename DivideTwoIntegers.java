package leetcode;

public class DivideTwoIntegers {

    public static void main(String[] args) {

        System.out.println(6 >> 1);
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        System.out.println(divideTwoIntegers.divide(1,1));
        System.out.println(Integer.MIN_VALUE);

    }

    public int divide(int dividend, int divisor) {
        int sign = 1;

        if ((dividend < 0 && divisor>0) || (dividend>0 && divisor<0)){
            sign = -1;
        }

        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);

        return sign * divideHelp(absDividend,absDivisor,0);
    }

    public int divideHelp(long divident, long divisor, int counter){

        if (divisor == divident){
            return 1;
        }

        if (divisor > divident){
            return 0;
        }

        while (divident - divisor  > 0){
            divident = divident-divisor;
            counter++;
        }
        return counter;
    }

    public int divide1(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;

        if(dividend > 0 && divisor > 0) return divideHelper(-dividend, -divisor);

        else if(dividend > 0) return -divideHelper(-dividend,divisor);

        else if(divisor > 0) return -divideHelper(dividend,-divisor);

        else return divideHelper(dividend, divisor);
    }

    private int divideHelper(int dividend, int divisor){
        // base case
        if(divisor < dividend) return 0;
        // get highest digit of divisor
        int cur = 0, res = 0;
        while((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) {
            cur++;
        }
        res = dividend - (divisor << cur-1);
        if(res > divisor) return 1 << cur-1;
        return (1 << cur-1)+divide(res, divisor);
    }

}
