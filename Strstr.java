package Leetcode;

public class Strstr {

    /**
     *
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     * Example 1:
     *
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     *
     * @return
     */
    public int strstr(String haystack, String needle){

        for (int i = 0; i < haystack.length(); i++) {
            if ( haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
