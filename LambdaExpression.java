package DataStructure;

import java.util.*;

public class LambdaExpression {

    public static void main(String[] args) {

        System.out.println("abc".startsWith("c"));
        Runnable myLambda = ()-> System.out.printf("running");
        Thread thread = new Thread(myLambda);
        thread.start();

        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("cde");

        for (String s : strings) {

        }

        Collections.sort(new ArrayList<String>(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


    }

}
