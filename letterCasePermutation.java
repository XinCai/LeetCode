package Leetcode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class letterCasePermutation implements Comparator<letterCasePermutation> {
    public static List<String> letterCasePermutation(String S) {
        if (S == null) {
            return new LinkedList();
        }
        Queue<String> queue = new LinkedList();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return (List<String>) queue;
    }

    int weight;

    public static void main(String[] args) {
        String s = "a1b2";
        //letterCasePermutation(s);


    }

    @Override
    public int compare(letterCasePermutation o1, letterCasePermutation o2) {
        return o1.weight - o2.weight;
    }
}
