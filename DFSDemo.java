package DFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DFSDemo {
    /**
     *  Graph 1
     *
     *          0
     *        /  \
     *       1    2
     *       |    |
     *       3    4
     *        \  /
     *          5
     *
     *
     *
     *  Graph 2
     *          1
     *         /  \
     *       0     2 - 4 - 5
     *        \
     *         3
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        Node<Integer> node_0 = new Node<Integer>();
        node_0.value = 0;

        Node<Integer> node_1 = new Node<Integer>();
        node_1.value = 1;

        Node<Integer> node_2 = new Node<Integer>();
        node_2.value = 2;

        Node<Integer>  node_3 = new Node<Integer>();
        node_3.value = 3;

        Node<Integer> node_4 = new Node<Integer>();
        node_4.value = 4;

        Node<Integer> node_5 = new Node<Integer>();
        node_5.value = 5;

        // Graph 1
//        List<Node<Integer>> neighbours_0 = new ArrayList<>();
//        neighbours_0.add(node_1);
//        neighbours_0.add(node_2);
//        node_0.neighbours = neighbours_0;
//
//        List<Node<Integer>> neighbours_1 = new ArrayList<>();
//        neighbours_1.add(node_0);
//        neighbours_1.add(node_3);
//        node_1.neighbours = neighbours_1;
//
//        List<Node<Integer>> neighbours_2 = new ArrayList<>();
//        neighbours_2.add(node_0);
//        neighbours_2.add(node_4);
//        node_2.neighbours = neighbours_2;
//
//        List<Node<Integer>> neighbours_3 = new ArrayList<>();
//        neighbours_3.add(node_1);
//        neighbours_3.add(node_5);
//        node_3.neighbours = neighbours_3;
//
//        List<Node<Integer>> neighbours_4 = new ArrayList<>();
//        neighbours_4.add(node_2);
//        neighbours_4.add(node_5);
//        node_4.neighbours = neighbours_4;
//
//        List<Node<Integer>> neighbours_5 = new ArrayList<>();
//        neighbours_5.add(node_3);
//        neighbours_5.add(node_4);
//        node_5.neighbours=neighbours_5;


        List<Node<Integer>> neighbours_0 = new ArrayList<>();
        neighbours_0.add(node_1);
        neighbours_0.add(node_3);
        node_0.neighbours = neighbours_0;

        List<Node<Integer>> neighbours_1 = new ArrayList<>();
        neighbours_1.add(node_0);
        neighbours_1.add(node_2);
        node_1.neighbours = neighbours_1;

        List<Node<Integer>> neighbours_2 = new ArrayList<>();
        neighbours_2.add(node_4);
        node_2.neighbours = neighbours_2;

        List<Node<Integer>> neighbours_3 = new ArrayList<>();
        neighbours_3.add(node_0);
        node_3.neighbours = neighbours_3;


        List<Node<Integer>> neighbours_4 = new ArrayList<>();
        neighbours_4.add(node_2);
        neighbours_4.add(node_5);
        node_4.neighbours = neighbours_4;

        List<Node<Integer>> neighbours_5 = new ArrayList<>();
        neighbours_5.add(node_4);
        node_5.neighbours=neighbours_5;

        DFSDemo dfs = new DFSDemo();
        dfs.DFS(node_0, new HashSet<>());

    }

    // Use Recursion to  implement DFS ( depth first search a graph )
    private void DFS (Node startNode, HashSet<Node> visited){

        visited.add(startNode);
        System.out.println("DFS travel graph :" + startNode.value);

        for (int i = 0; i < startNode.neighbours.size(); i++) {
            Node current = (Node) startNode.neighbours.get(i);
            if (!visited.contains(current)){
                DFS(current, visited);
            }
        }
//        for (Node current : startNode.neighbours) {
//            if (!visited.contains(current)){
//                DFS(current);
//            }
//        }
//    }

    }
}
