package BFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyLinkedListForGraph {

    private static void bfs(HashMap<Character, LinkedList<Character>> graph, HashMap<Character, Integer> dist, char start){
        Queue<Character> q=new LinkedList<>();

        q.add(start);//将s作为起始顶点加入队列

        dist.put(start, 0);
        int i=0;
        while(!q.isEmpty())
        {
            char top=q.poll();//取出队首元素
            i++;
            System.out.println("The "+i+"th element:"+top+" Distance from s is:"+dist.get(top));
            int d=dist.get(top)+1;//得出其周边还未被访问的节点的距离
            for (Character c : graph.get(top)) {
                if(!dist.containsKey(c))//如果dist中还没有该元素说明还没有被访问
                {
                    dist.put(c, d);
                    q.add(c);
                }
            }
        }
    }

    public static void main(String args[])
    {
        AdjacencyLinkedListForGraph bb = new AdjacencyLinkedListForGraph();

        LinkedList<Integer> list_1 = new LinkedList<>();
        list_1.add(1);
        list_1.add(2);

        LinkedList<Integer> list_2 = new LinkedList<>();
        list_2.add(1);
        list_2.add(5);
        list_2.add(4);
        list_2.add(3);

        LinkedList<Integer> list_3 = new LinkedList<>();
        list_3.add(2);
        list_3.add(4);


        LinkedList<Integer> list_4 = new LinkedList<>();
        list_4.add(3);
        list_4.add(2);
        list_4.add(5);

        LinkedList<Integer> list_5 = new LinkedList<>();
        list_5.add(1);
        list_5.add(2);
        list_5.add(4);

        HashMap<Integer, LinkedList<Integer>> numGraph = new HashMap<>();

        numGraph.put(1,list_1);
        numGraph.put(2,list_2);
        numGraph.put(3,list_3);
        numGraph.put(4,list_4);
        numGraph.put(5,list_5);

        HashMap<Character, Integer> visited = new HashMap<>();


        // s顶点的邻接表
        LinkedList<Character> list_s = new LinkedList<>();
        list_s.add('w');
        list_s.add('r');
        LinkedList<Character> list_w = new LinkedList<>();
        list_w.add('s');
        list_w.add('i');
        list_w.add('x');
        LinkedList<Character> list_r = new LinkedList<>();
        list_r.add('s');
        list_r.add('v');
        LinkedList<Character> list_x = new LinkedList<>();
        list_x.add('w');
        list_x.add('i');
        list_x.add('u');
        list_x.add('y');
        LinkedList<Character> list_v = new LinkedList<>();
        list_v.add('r');
        LinkedList<Character> list_i = new LinkedList<>();
        list_i.add('u');
        list_i.add('x');
        list_i.add('w');
        LinkedList<Character> list_u = new LinkedList<>();
        list_u.add('i');
        list_u.add('x');
        list_u.add('y');
        LinkedList<Character> list_y = new LinkedList<>();
        list_y.add('u');
        list_y.add('x');

        HashMap<Character, LinkedList<Character>> graph = new HashMap<>();
        graph.put('s', list_s);
        graph.put('w', list_w);
        graph.put('r', list_r);
        graph.put('x', list_x);
        graph.put('v', list_v);
        graph.put('i', list_i);
        graph.put('y', list_y);
        graph.put('u', list_u);

        HashMap<Character, Integer> dist = new HashMap<>();
        char start = 's';
        bb.bfs(graph, dist, start);

    }
}
