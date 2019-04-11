package Leetcode;


import sun.misc.CharacterEncoder;

import java.util.Stack;

public class validParentheses {

    public static void main(String[] args) {
        String s = "(]";
        String b = "([)";
        Character.toLowerCase('c');
//        Character.isLetter();
//        Character.isUpperCase();
//        Character.isDigit();



        validParentheses(b);
        System.out.println(isValid(s));

    }

    /**
     *
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     *
     *
     * public boolean isValid(String s) {
     * 	Stack<Character> stack = new Stack<Character>();
     * 	for (char c : s.toCharArray()) {
     * 		if (c == '(')
     * 			stack.push(')');
     * 		else if (c == '{')
     * 			stack.push('}');
     * 		else if (c == '[')
     * 			stack.push(']');
     * 		else if (stack.isEmpty() || stack.pop() != c)
     * 			return false;
     *        }
     * 	return stack.isEmpty();
     * }
     *
     *
     *
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {


        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static boolean validParentheses(String s){
        if(s.length() == 0 ){
            return false;
        }

        Stack<Character> stack = new Stack();

        for (int i=0; i< s.length() ; i++ ) {
            if(s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i)== '['){
                stack.push(s.charAt(i));
            }

            if(s.charAt(i) == ')'){
                if(stack.isEmpty() || stack.pop()!= '('){
                    return false;
                }

            }

            if(s.charAt(i) == '}'){
                if(stack.isEmpty() || stack.pop()!= '{'){
                    return false;
                }

            }

            if(s.charAt(i) == ']'){

                if(stack.isEmpty() || stack.pop()!='['){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }



}
