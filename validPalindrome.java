package Leetcode;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length() ;i++ ) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        String temp = sb.toString();
        temp    = temp.toLowerCase();

        int i = 0;
        int j = temp.length() - 1;

        while(i < j){
            if(temp.charAt(i) != temp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
