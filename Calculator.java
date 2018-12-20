package node;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
        String temp = "1 - 3 + 4 + 5";
        System.out.println(evaluate(temp));

        List<String> list = new Stack<>();
    }

    public static int evaluate(final String input) {

        //split string into element array
        //put all element on stack , via looping for each
        //while loop , stack.size()>1
        String[] strings = input.split(" ");
        Deque<String> stack = new ArrayDeque<>();
        for (String ele: strings) {
            stack.add(ele);
        }

        while(stack.size() > 1){
            int left = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int right = Integer.parseInt(stack.pop());

            int result = 0;

            switch(operator){
                case "+" : result = left+right;break;
                case "-" : result = left-right; break;
            }

            stack.push(String.valueOf(result));

        }

        return Integer.parseInt(stack.pop());
    }
}
