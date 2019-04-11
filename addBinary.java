package Leetcode;

public class addBinary {

    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;

        while (i>=0 || j >=0){
            if(j>=0){
                sum = sum + b.charAt(j) - '0';
                j--;
            }

            if (i>=0){
                sum = sum + a.charAt(i) - '0';
                i--;
            }

            sb.append(sum % 2);
            sum = sum /2;
        }

        if (sum !=0){
            sb.append(sum);
        }

        sb.indexOf("a");

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";

//        Integer x = Integer.parseInt(a,2);
//        Integer y = Integer.parseInt(b,2);

//        int sum = x + y ;

        //System.out.println(Integer.toBinaryString(sum));
        int sum = a.charAt(1);
        int tmp = '0';

        System.out.println(sum);
        sum = '1' - '0';
        //System.out.println(tmp);
        System.out.println(sum);

        System.out.println(addBinary("11","1"));

    }


}
