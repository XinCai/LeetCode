package node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String temp = "helo";
        String temp1 = "helo";

        Integer i = 9;
        Integer j = 10;
        System.out.println(i.hashCode());
        System.out.println(j.hashCode());

        System.out.println(temp.hashCode());
        System.out.println(temp1.hashCode());

    }



}
