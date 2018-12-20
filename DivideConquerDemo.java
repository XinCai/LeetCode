package node;

public class DivideConquerDemo {
    public static void main(String[] args) {

        System.out.println(findMaxSizeSquare(1680,640));
    }

    public static int findMaxSizeSquare(int length, int width){
        if (length ==0 || width ==0){
            return 0;
        }

        if (length == width){
            return width;
        }

        if (length > width){
            return  findMaxSizeSquare( length-width, width);
        }else {
            return findMaxSizeSquare( length, width- length );
        }
    }
}
