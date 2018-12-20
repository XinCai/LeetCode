package DFS;


import java.util.*;

public class BFS {
    /**
     *        Graph
     *
     *         0
     *        / \
     *       1 - 2
     *      /     \
     *     4      3
     *      \    /
     *        5
     *
     *
     */

    public static void main(String[] args) {
        Node<Object> node_0 = new Node<>();
        node_0.value = 0;

        Node<Object> node_1 = new Node<>();
        node_1.value = 1;

        Node<Object> node_2 = new Node<>();
        node_2.value = 2;

        Node<Object> node_3 = new Node<>();
        node_3.value = 3;

        Node<Object> node_4 = new Node<>();
        node_4.value = 4;

        Node<Object> node_5 = new Node<>();
        node_5.value = 5;

        List<Node<Object>> neighbours_0 = new ArrayList<Node<Object>>();
        neighbours_0.add(node_1);
        neighbours_0.add(node_2);
        node_0.neighbours = neighbours_0;

        List<Node<Object>> neighbours_1 = new ArrayList<Node<Object>>();
        neighbours_1.add(node_0);
        neighbours_1.add(node_2);
        neighbours_1.add(node_4);
        node_1.neighbours = neighbours_1;

        List<Node<Object>> neighbours_2 = new ArrayList<Node<Object>>();
        neighbours_2.add(node_0);
        neighbours_2.add(node_1);
        neighbours_2.add(node_3);
        node_2.neighbours = neighbours_2;

        List<Node<Object>> neighbours_3 = new ArrayList<Node<Object>>();
        neighbours_3.add(node_2);
        neighbours_3.add(node_5);
        node_3.neighbours = neighbours_3;

        List<Node<Object>> neighbours_4 = new ArrayList<Node<Object>>();
        neighbours_4.add(node_1);
        neighbours_4.add(node_5);
        node_4.neighbours = neighbours_4;

        List<Node<Object>> neighbours_5 = new ArrayList<Node<Object>>();
        neighbours_5.add(node_4);
        neighbours_5.add(node_3);
        node_5.neighbours=neighbours_5;

        BFS bfsDemo = new BFS();
        bfsDemo.BFS(node_5);
    }

    private void BFS(Node startNode){
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> visitedNode = new HashSet<>();  // use HashSet to check visited nodes !!!
        queue.add(startNode);
        visitedNode.add(startNode);

        while (!queue.isEmpty()){
            Node top = queue.poll();
            System.out.println("Grapah BFS visited: " + top.value );
            List<Node> neighbours = top.neighbours;
            for (Node current : neighbours) {
                if (!visitedNode.contains(current)){
                    visitedNode.add(current);
                    queue.add(current);
                }
            }
        }
    }






}
