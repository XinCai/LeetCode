package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class letterPermutation {

    /**
     *
     *  S = "a1b2" ;
     *
     *  ["a1b2", ]
     *
     * @param S
     * @return
     */
    public List<String> letterCasePermutation(String S) {
        // write your code here
        ArrayList<String> res= new ArrayList();

        int left = 0 ;
        int right = S.length() -1 ;

        for (int i=0; i<S.length(); i++ ) {
            StringBuilder sb = new StringBuilder();

            if(Character.isDigit(S.charAt(i))){
                sb.append(S.charAt(i));
            }

            if (Character.isLetter(S.charAt(i)) && Character.isUpperCase(S.charAt(i))){
                char curr = Character.toLowerCase(S.charAt(i));
                sb.append(curr);
                res.add(sb.toString());

            }else if (Character.isLetter(S.charAt(left)) && Character.isLowerCase(S.charAt(left))) {
                char curr = Character.toUpperCase(S.charAt(i));
                sb.append(curr);
                res.add(sb.toString());
            }
        }

        return res;
    }

}
