package lintcode;

/**
 *  样例
 *  如果 source = "source" 和 target = "target"，返回 -1。 source.length() 6 , target.length() 6
 *  如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 *
 *  String question
 */
public class Strstr {

    public int strStr(String source, String target){

        // if one of the string is null, then immediate return -1
        if (source == null || target == null){
            return -1;
        }

        // if target length is longer than source one, for sure, it return -1
        if ( source.length() < target.length()){
            return -1;
        }
        // first consider the boundary issue , put under those boundary condition statement
        int sourceLength = source.length();
        int targetLength = target.length();

        // second consider the looping issue

        // why source.length() - target.length() , => consider the boundary, looping source string, when the rest length of source string is shorter than target string,
        // for sure, it wouldn't find target string in source string, immediately return -1
        //
        // why "+1" , => boundary condition, when two string are same length
        for (int i = 0; i < sourceLength - targetLength +1; i++){
            int j = 0;
            for (; j < targetLength; j++) {
                if (source.charAt(i+j) != target.charAt(j)){
                    break;
                }
            }
            if (j==targetLength){
                return i; // determine the position of source index, and return it.
            }
        }

        return -1;
    }

}
