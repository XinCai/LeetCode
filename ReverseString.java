package leetcode;

/**
 * Created by KXC176 on 26/10/2017.
 *
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".


 ++i increments and then uses the variable.
 i++ uses and then increments the variable.

 */
public class ReverseString {

    public static void main(String[] args) {

        int j = 1 ;
        int i = 1;
        j = ++i;
        System.out.println("j should be 1 : " + j);
        System.out.println("i should be 2 : "+ i);

        ReverseString rev = new ReverseString();
        System.out.println("result is : " + rev.reverseString1("hello"));

    }

    /**
     * solution one
     * @param s
     * @return
     */
    public String reverseString1(String s){

        int length = s.length();
        String result = "";
        String[] leeter =  s.split("");

        for (int i = length-1; i>= 0; i--){
            result = result + leeter[i];
        }

        return result;
    }

    /**
     * solution two
     * @param s
     * @return
     */
    public String reverseString2(String s){
        char[] array = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            System.out.println(i);
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return new String(array);
    }
}
