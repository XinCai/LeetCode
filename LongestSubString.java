package node;


import java.util.HashSet;

public class LongestSubString {



    public static void main(String[] args) {
        //String s = "abcabcbb";
        String s = "aab";
//        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring2(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int res = 0;
        HashSet<Character> set = new HashSet<>();
        int start =0, end =0; //sliding window , two pointer, one is start, one is end


        while ( start<s.length() && end < s.length()){
            if (set.contains(s.charAt(end))){ //when there is a duplicate character found ,
                set.remove(s.charAt(start)); // remove the first duplicate character
                start++;  // move pointer to next position
            }else {
                set.add(s.charAt(end)); // when there isn't any character found in set , add into set
                res = Math.max(res, set.size()); // every time , add into new set, and check what is max size of set
                end++; // move pointer to next
            }
        }
        return res;

    }

    public static int lengthOfLongestSubstring2(String s) {

        int max =0 ;
        int start =0, end;

        HashSet<Character> set = new HashSet<>();

        for (end = 0; end < s.length() ; ) {

            if (set.contains(s.charAt(end))){  //check found duplicated character in set , then remove this character ,and increase start pointer
                set.remove(s.charAt(start));
                start++;
            }else {
                set.add(s.charAt(end));
                max = Math.max(max, set.size());
                end++;
            }
        }

        return max;

    }
}
