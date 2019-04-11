package datastructers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class DirectedGraphNode {
      int label;

      ArrayList<DirectedGraphNode> neighbors;
      DirectedGraphNode(int x) {
          label = x;
          neighbors = new ArrayList<DirectedGraphNode>();
      }
  }

public class TopologicalSort {

    /**
     *
     *          /-------> 1 ---------->
     *         0 -----------> 2 ----->  4
     *          \------> 3 -- | ----->
     *                   |    |
     *                   |    |
     *                   |    |
     *                    --> 5
     *
     *
     *  The topological order can be:
     *
     * [0, 1, 2, 3, 4, 5]
     * [0, 2, 3, 1, 5, 4]
     *
     *
     * Graph
     * For example:
     *
     * {1,2,4#2,1,4#3,5#4,1,2#5,3} represents follow graph:
     *
     * 1------2  3
     *  \     |  |
     *   \    |  |
     *    \   |  |
     *     \  |  |
     *       4   5
     * we use # to split each node information.
     * 1,2,4 represents that 2, 4 are 1's neighbors
     * 2,1,4 represents that 1, 4 are 2's neighbors
     * 3,5 represents that 5 is 3's neighbor
     * 4,1,2 represents that 1, 2 are 4's neighbors
     * 5,3 represents that 3 is 5's neighbor
     *
     * @param args
     */

    public static void main(String[] args) {
        ArrayList<DirectedGraphNode> graph = new ArrayList<>();

        DirectedGraphNode a0 = new DirectedGraphNode(0);
        DirectedGraphNode a1 = new DirectedGraphNode(1);
        DirectedGraphNode a2 = new DirectedGraphNode(2);
        DirectedGraphNode a3 = new DirectedGraphNode(3);
        DirectedGraphNode a4 = new DirectedGraphNode(4);
        DirectedGraphNode a5 = new DirectedGraphNode(5);

        ArrayList<DirectedGraphNode> a0List = new ArrayList<>();
        a0List.add(a1);
        a0List.add(a2);
        a0List.add(a3);
        a0.neighbors = a0List;

        ArrayList<DirectedGraphNode> a1List = new ArrayList<>();
        a1List.add(a4);
        a1.neighbors = a1List;


        ArrayList<DirectedGraphNode> a2List = new ArrayList<>();
        a2List.add(a4);
        a2List.add(a5);
        a2.neighbors = a2List;


        ArrayList<DirectedGraphNode> a3List = new ArrayList<>();
        a3List.add(a4);
        a3List.add(a5);
        a3.neighbors = a3List;


        ArrayList<DirectedGraphNode> a4List = new ArrayList<>();
        a4.neighbors = a4List;

        ArrayList<DirectedGraphNode> a5List = new ArrayList<>();
        a5.neighbors = a5List;

        graph.add(a0);
        graph.add(a1);
        graph.add(a2);
        graph.add(a3);
        graph.add(a4);
        graph.add(a5);

        TopologicalSort topologicalSort = new TopologicalSort();
        topologicalSort.topSort(graph);


    }

        /**
         * @param graph: A list of Directed graph node
         * @return: Any topological order for the given graph.
         */
        public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
            // write your code here
            ArrayList<DirectedGraphNode> result = new ArrayList<DirectedGraphNode>();

            HashMap<DirectedGraphNode, Integer> map = new HashMap();

            for (DirectedGraphNode node : graph) {

                for (DirectedGraphNode neighbor : node.neighbors) {
                    if (map.containsKey(neighbor)) {
                        map.put(neighbor, map.get(neighbor) + 1);
                    } else {
                        map.put(neighbor, 1);
                    }
                }
            }

            Queue<DirectedGraphNode> q = new LinkedList<DirectedGraphNode>();

            // put start node into queue , and result list
            for (DirectedGraphNode node : graph) {
                if (!map.containsKey(node)) {
                    q.offer(node);
                    result.add(node);
                }
            }

            while (!q.isEmpty()) {
                DirectedGraphNode node = q.poll();

                for (DirectedGraphNode n : node.neighbors) {
                    map.put(n, map.get(n) - 1);
                    if (map.get(n) == 0) {
                        result.add(n);
                        q.offer(n);
                    }
                }
            }

            return result;
        }

}
