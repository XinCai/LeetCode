package node;

/**
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 *
 * Input: "cbbd"
 * Output: "bb"
 *
 */

public class LongestPalindromicSubstring {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("hih");
        StringBuilder temp = sb.reverse();
        System.out.println( sb.equals(temp.toString()));
        System.out.println(sb);

        int temp1 = 13/2;

        System.out.println(temp1);

    }

    public String longestPalindrome1(String s) {

        int n = s.length();
        String res = null;

        boolean[][] dp = new boolean[n][n];

        for (int i = n-1; i >=0 ; i--) {

        }

        return "";
    }

    public String longestPalindrome(String s) {

        StringBuilder res = new StringBuilder();

        int start=0, end=0;

        for (int i = 0; i < s.toCharArray().length; i++) {
            System.out.println(s.charAt(i));

        }

        return s.substring(start,end);
    }


    public boolean isPalindrome(String s, int start, int end){

        if (start == end){  // why
            return true;
        }

        s.substring(1,2);

        if (s.charAt(start) == s.charAt(end)){
            return isPalindrome(s,start+1,end-1);
        }
        return false;
    }

}
