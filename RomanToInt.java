package node;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {

        String temp = "IV";

        System.out.println( romanToInt(temp) );
    }

    /**
     * Input: "III"
     * Output: 3
     *
     * Input: "IV"
     * Output: 4
     *
     * Input: "IX"
     * Output: 9
     *
     * Input: "LVIII"
     * Output: 58
     * Explanation: C = 100, L = 50, XXX = 30 and III = 3.
     *
     *
     * Input: "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     * @param romanStr
     * @return
     */

    public static int romanToInt(String romanStr){

        romanStr.toUpperCase();
        char[] chars = romanStr.toCharArray();

        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            int temp = 0;
            switch (chars[i]){
                case 'I': temp = 1; break;
                case 'V': temp =5; break;
                case 'X': temp = 10; break;
                case 'L': temp= 50; break;
                case 'C': temp = 100; break;
                case 'D': temp = 500; break;
                case 'M': temp = 1000;  break;
            }

            result = result + temp;
        }

        if (romanStr.indexOf("IV") != -1 ){
            result = result  -2;
        }

        if (romanStr.indexOf("IX") != -1){
            result = result - 2;
        }

        if (romanStr.indexOf("XL") != -1){
            result = result - 20;
        }

        if (romanStr.indexOf("XC") != -1){
            result = result - 20;
        }

        if (romanStr.indexOf("CD") != -1){
            result = result - 200;
        }

        if (romanStr.indexOf("CM") != -1){
            result = result - 200;
        }
        return  result;
    }

    public static int romanToInt2(String s){
        int result = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);



        return result;

    }


}
