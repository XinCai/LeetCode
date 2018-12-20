package leetcode;

public class LongestPalindromicSubStr {

    public static void main(String[] args) {

    }


    public String longestPalindrome(String s) {

        String res = "";
        char[] arr =  s.toCharArray();

        int start = 0;
        int end = 0;

        isPalindrome(s, start, end);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



        return res;
    }

    private boolean isPalindrome(String s, int start, int end) {

        return false;
    }

}

