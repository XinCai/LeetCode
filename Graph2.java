package BFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph2 {
    //use AdjacentTable to represent a graph

    public static void main(String[] args) {
        HashMap<Character, LinkedList<Character>> graph = new HashMap<>();
        LinkedList<Character> list_s = new LinkedList<>();
        list_s.add('u');
        list_s.add('w');
        LinkedList<Character> list_u = new LinkedList<>();
        list_u.add('s');
        list_u.add('i');
        list_u.add('r');
        LinkedList<Character> list_w = new LinkedList<>();
        list_w.add('s');
        list_w.add('x');
        LinkedList<Character> list_r = new LinkedList<>();
        list_r.add('u');
        list_r.add('i');
        list_r.add('y');
        LinkedList<Character> list_i = new LinkedList<>();
        list_i.add('u');
        list_i.add('r');
        list_i.add('x');
        list_i.add('y');
        list_i.add('z');
        LinkedList<Character> list_x = new LinkedList<>();
        list_x.add('w');
        list_x.add('i');
        LinkedList<Character> list_y = new LinkedList<>();
        list_y.add('r');
        list_y.add('i');
        LinkedList<Character> list_z = new LinkedList<>();
        list_z.add('i');

        graph.put('s', list_s);
        graph.put('i', list_i);
        graph.put('y', list_y);
        graph.put('z', list_z);
        graph.put('r', list_r);
        graph.put('w', list_w);
        graph.put('u', list_u);
        graph.put('x', list_x);

        BFS(graph,'s');


     }

     private static void BFS (HashMap<Character, LinkedList<Character>> graph, Character startVertex){

         Queue<Character> queue = new LinkedList<>();

         HashMap<Character, Boolean> visitedVertex = new HashMap<>();

         queue.add(startVertex);

         while (!queue.isEmpty()){
             Character top =  queue.poll();
             System.out.println("current visited character :" + top );
             visitedVertex.put(top,true);
             for (Character c : graph.get(top)) {
                 if (!visitedVertex.containsKey(c)){
                     queue.add(c);
                     visitedVertex.put(c,true);
                 }
             }
         }
     }

}
