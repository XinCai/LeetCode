package lintcode;

public class FizzBuzz {
    public static void main(String[] args) {
//        int i = 5>>1;
//        System.out.println(i);
//
//        int j = 5;
//        System.out.println(Integer.toBinaryString(j));
//        System.out.println( 5 & (5-1));

        countOnes3(5);

        System.out.println(Integer.toBinaryString(-1));
    }

    /**
     * counting how many 1 as binary digit in the num
     *
     * 5 : 101  == two 1s
     * 6 : 110  == two 1s
     * 7 : 111  == three 1s
     *
     *
     * @param num
     * @return
     */
    public static int countOnes3(int num){
        int count = 0;
        while(num!=0){
            num = num & (num-1);
            // counter right most 1 , for example, 101 after num & (num -1) => 101 & (100) = 100 (equals 4, remove right most 1 , then 101 became 100 )
            // 4 & (4-1) => 100 & 011 => 000, remove 4 , 100 right most 1, then 100 became 000 .
            count++;
        }
        return count;
    }

    public static int countOnes1(int num){
        int count = 0;
        while(num>0){
           if((num&1) ==1){
               count++;
           }
           num= num>>1;
        }
        return count;
    }


    public static int countOnes2(int num){
        int counter = 0 ;
        String temp = Integer.toBinaryString(num);
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1'){
                counter++;
            }
        }
        return counter;
    }


}
