package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 13 Roman to Integer
 *
 */
public class RomanToIntger {
    public static void main(String[] args) {
        RomanToIntger romanToIntger = new RomanToIntger();
        System.out.println(romanToIntger.romanToInt3("IVXLCDM"));
    }

    /**
     * Given a roman numeral, convert it to an integer. Test Roman integer concept, and usinng
     *      Input is guaranteed to be within the range from 1 to 3999.
     *
     *   hint:
     *  'I' = 1
     *  'V' = 5
     *  'X' = 10
     *  'L' = 50
     *  'C' = 100
     *  'D' = 500
     *  'M' = 1000
     *
     *  6 special cases , only happen two characters present together
     *
     *  'IV' = 4
     *  'IX' = 9
     *  'XL' = 40
     *  'XC' = 90
     *  'CD' = 400
     *  'CM' = 900
     * @param s
     * @return
     */
    public int romanToInt(String s){

        // use map to store roman number , key value pair
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        //store integer result
        Integer result = 0 ;

        for (int i = 0; i < s.length()-1; i++) {
//            String[] table = s.split("");
            char v1 = s.charAt(i);
            char v2 = s.charAt(i+1);

            if (map.get(v1)> map.get(v2)){
                result = result + map.get(v1) + map.get(v2);
            }else{
                result = result + map.get(v2) - map.get(v1);
            }
        }
        //switch (s.charAt())
        return result;
    }

    public int romanToInt2(String s){

        // find those special cases, and deduct value from the result, there are 6 special cases
        // use indexof() method to check if special string exist in the input S

        int result = 0 ;
        if (s.indexOf("IV")!= -1) result = result - 2;
        if (s.indexOf("IX")!= -1) result = result - 2;
        if (s.indexOf("XL") != -1) result = result - 20;
        if (s.indexOf("XC") != -1) result = result - 20;
        if (s.indexOf("CD") != -1) result = result - 200;
        if (s.indexOf("CM") != -1) result = result - 200;

        char[] myCharRoman = s.toCharArray();

        //add up value by each roman character
        for (int i=0; i<= myCharRoman.length - 1; i++){
            if (myCharRoman[i]=='M')    result = result + 1000;
            if (myCharRoman[i] == 'D') result = result + 500;
            if (myCharRoman[i] == 'C') result = result + 100;
            if (myCharRoman[i] =='L')    result = result + 50;
            if (myCharRoman[i] == 'X') result = result + 10;
            if (myCharRoman[i] == 'V') result = result + 5;
            if (myCharRoman[i] == 'I') result = result + 1;
        }
        return result;
    }

    /**
     * leetcode solution
     * @param s
     * @return
     */
    public int romanToInt3(String s){
        int sum=0;
        if(s.indexOf("IV")!=-1){sum-=2;}
        if(s.indexOf("IX")!=-1){sum-=2;}
        if(s.indexOf("XL")!=-1){sum-=20;}
        if(s.indexOf("XC")!=-1){sum-=20;}
        if(s.indexOf("CD")!=-1){sum-=200;}
        if(s.indexOf("CM")!=-1){sum-=200;}

        char c[]=s.toCharArray();
        int count=0;

        for(;count<=s.length()-1;count++){
            if(c[count]=='M') sum+=1000;
            if(c[count]=='D') sum+=500;
            if(c[count]=='C') sum+=100;
            if(c[count]=='L') sum+=50;
            if(c[count]=='X') sum+=10;
            if(c[count]=='V') sum+=5;
            if(c[count]=='I') sum+=1;

        }

        return sum;
    }
}
