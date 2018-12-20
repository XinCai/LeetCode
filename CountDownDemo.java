package node;

public class CountDownDemo {
    public static void main(String[] args) {
        countDown(4);
        System.out.println( factorial(5));
    }

    public static void countDown(int n){
        if (n==0) {
            return;
        }else {
            System.out.println(n);
            countDown(n-1);
        }
    }

    public static int factorial(int n){
        if (n==0) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
}
