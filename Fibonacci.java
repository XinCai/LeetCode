package leetcode;


public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        //System.out.println(fibonacci.Fib(1));
        int[] memo = new int[11];
        System.out.println(fibonacci.Fib2(10, memo));
    }

    public int Fib(int n){

        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }

        int result = Fib(n-1) + Fib(n-2);
        return result;
    }

    public int Fib2(int n, int[] memo){
        //memo = new int[n+1];

        if (n == 0){
            return n;
        }
        if (n ==1 || n ==2){
            memo[n] = 1;
            return 1;
        }

        if (memo[n] != 0){
            return memo[n];
        }

        int result = Fib2(n-1, memo) + Fib2(n-2, memo);
        memo[n] = result;

        return result;

    }
}
