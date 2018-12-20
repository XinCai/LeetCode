package node;

import java.util.ArrayList;
import java.util.List;

public class LintCodeFizzBuzz {

    public static void main(String[] args) {
        int n = 15;

        System.out.println(fizzBuzz(15));
    }


    public static List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();

        for (int i = 1; i<=n; i++){
            if (i%3 ==0 && i%5==0){
                result.add("fizz buzz");
            }else if (i%5 == 0){
                result.add("buzz");
            } else  if (i%3 == 0){
                result.add("fizz");
            }else result.add(String.valueOf(i));
        }

        return result;
    }
}
