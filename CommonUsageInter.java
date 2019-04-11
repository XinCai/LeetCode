package datastructers;

import java.util.*;

public class CommonUsageInter {

    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("aaa");
        queue.offer("bbb");
        queue.offer("ccc");
        queue.offer("ddd");
        queue.offer("e");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
