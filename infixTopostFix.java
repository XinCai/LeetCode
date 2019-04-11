package datastructers;

import java.util.Stack;

public class infixTopostFix {
    /**
     *  algorithm :
     *
     *  1) scan the infix expression from left to right
     *  2) if the scanned character is an number (operand) , output it
     *  3) Else
     *      if operator , which priority is greater than the operator in the stack (or stack is empty , or the stack contains a '(' ) --> push it
     *      else
     *      pop all operators from the stack which are  >= scanned operator ,
     *
     *  4) if scanned characer is '(' -> push to the stack
     *  5) if scanned character is ')' -> pop the stack , and output it until '(' is meet , discard the parenthesis
     *  6) scanned , repeated 2-6 until infix scanned
     *  7) pop and output from stack until is empty
     */

    static int checkPriortiy(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    static String infixToPostfix(String infixExpression){
        String result = "";

        Stack<Character> stack= new Stack<Character>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char c = infixExpression.charAt(i);
            if (Character.isLetterOrDigit(c)){
                result = result + c;
            }else if ( c == '('){
                stack.push(c);
            }else if (c == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    result = result + stack.pop();
                }

                stack.pop(); // pop out ' ( '

//                if (stack.isEmpty() && stack.peek() != '('){
//                    return "invalid expression";
//                }else {
//                    stack.pop();
//                }
            }else {
                while (!stack.isEmpty() && checkPriortiy(c) <= checkPriortiy(stack.peek())){
                    result = result  + stack.pop();
                }
                stack.push(c);

            }
        }

        while (!stack.isEmpty()){
            result = result + stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String infix = "1+5*(6-3)+7";

        System.out.println(infixToPostfix(infix));
        String postfix = infixToPostfix(infix);

        Stack<Integer> stack = new Stack();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isDigit(c)){
                stack.push(Integer.parseInt(String.valueOf(c)));
            }else {
                int right = stack.pop();
                int left = stack.pop();
                int tmp = doMath(c,left,right);
                stack.push(tmp);
            }
        }

        System.out.println(stack.pop());
    }

    private static int doMath(char c, int left, int right) {

        switch (c){
            case '+':
                return left + right;
            case '-':
                return left - right;
            case '*':
                return left * right;
            case '/':
                return left / right;
        }

        return Integer.MAX_VALUE;
    }
}
