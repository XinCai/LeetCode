package leetcode;

import java.util.Stack;

public class PalindromeNum {
    public static void main(String[] args) {
        PalindromeNum palindromeNum = new PalindromeNum();
        System.out.println(palindromeNum.isPalindrome(10));
    }


    public boolean isPalindrome(int x) {
        boolean result;
        String str =  String.valueOf(x);
        int length = str.toCharArray().length;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            stack.push(str.toCharArray()[i]);
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        if ( str.equals(sb.toString())){

            result = true;

        }else{

            result = false;
        }

        return result;
    }


}
