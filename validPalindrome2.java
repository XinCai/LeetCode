package Leetcode;

public class validPalindrome2 {
    public static void main(String[] args) {

    }

    public static boolean validPalindrome(String s){
        for (int start = 0, end = s.length() - 1; start < end; start++, end--) {
            if (s.charAt(start) != s.charAt(end)){
                return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);
            }
        }

        return true;
    }

    public static boolean isPalindrome(String s, int left, int right){
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


}
