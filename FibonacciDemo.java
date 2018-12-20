package node;

public class FibonacciDemo {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci1(n));


    }

    public static int fibonacci(int n) {
        if (n ==0){
            return 0;
        }

        if (n ==1){
            return 1;
        }

        if (n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int fibonacci1(int n) {

        if (n ==1){
            return 0;
        }

        if (n==2){
            return 1;
        }

        int a = 0, b = 1, c;

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }


}
