package leetcodeEasy;

import java.util.Arrays;

/**
 * Created by caixin on 28/10/17.
 * <p>
 * leetcode 242
 */
public class ValidAnagram {

    /**
     *
     * 定义：
     * An anagram is a type of word play,
     * the result of rearranging the letters of a word or phrase to produce a new word or phrase,
     * using all the original letters exactly once;
     * for example orchestra can be rearranged into carthorse.
     * Someone who creates anagrams may be called an "anagrammatist".
     * <p>
     * Note:  You may assume the string contains only lowercase alphabets.
     * <p>
     * 給兩個字串s與t，回傳t是否為s的重組字
     * 使用original letter exactly once ,只能使用一次letter
     * 判断 字符串长度一致，不一致返回false
     * 字符串长度一致的情况下，转化 string to char array
     *
     * 利用 array util 函数 进行 排序 char array，字母从 a to z 大到小的顺序排列
     * 利用 string valueof 函数 进行 charArray 转型，
     *
     * 之后 两个 string 进行比较
     * 返回比较结果
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram1(String s, String t) {

        char[] source = s.toCharArray();
        char[] dest = t.toCharArray();

        if (s.length() != t.length()) {
            return false;
        } else {
            Arrays.sort(source);
            Arrays.sort(dest);
            System.out.println(String.valueOf(source));
            System.out.println(String.valueOf(dest));
            return String.valueOf(source).equals(String.valueOf(dest));
        }

    }

    /**
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t){

        System.out.println('B'-'A'); // char 的 位置
        return false;
    }

    public static void main(String[] args) {
        ValidAnagram valid = new ValidAnagram();
        //System.out.println(valid.isAnagram1("cat", "nst"));
        System.out.println(valid.isAnagram2("terry","harry"));
    }
}
