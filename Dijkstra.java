package Dijkstra;

import java.util.*;

class Edge {
    int weight;
    Node destination;

    public Edge(int weight, Node destination) {
        this.weight = weight;
        this.destination = destination; }
} ;

class Node {

    public Node(String name) {
        this.name = name;
    }

    String name;
    int weightFromSource = Integer.MAX_VALUE;
    List<Edge> edges;
}

public class Dijkstra {
/**
 *
 *  Graph with weight
 *
 *            1       6
 *        B ----- D ---- F
 *    5 / |      /|
 *    /   |     / |
 *   A   2|  4 /  |
 *    \   |   /   | 3
 *   1 \  |  /    |
 *      \ | /     |
 *        C ----- E
 *            8
 *
 *
 * */


    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");

        Edge A_B = new Edge(5,B);
        Edge A_C = new Edge(1,C);
        Edge B_A = new Edge(5,A);
        Edge B_C = new Edge(2,C);
        Edge B_D = new Edge(1,D);
        Edge C_A = new Edge(1,A);
        Edge C_B = new Edge(2,B);
        Edge C_D = new Edge(4,D);
        Edge C_E = new Edge(8,E);
        Edge D_B = new Edge(1,B);
        Edge D_C = new Edge(4,C);
        Edge D_E = new Edge(3,E);
        Edge D_F = new Edge(6,F);
        Edge E_C = new Edge(8,C);
        Edge E_D = new Edge(3,D);
        Edge F_D = new Edge(6,D);

        ArrayList<Edge> A_edges = new ArrayList<Edge>();
        A_edges.add(A_B);
        A_edges.add(A_C);
        A.edges = A_edges;

        ArrayList<Edge> B_edges = new ArrayList<Edge>();
        B_edges.add(B_A);
        B_edges.add(B_C);
        B_edges.add(B_D);
        B.edges = B_edges;

        ArrayList<Edge> C_edges = new ArrayList<Edge>();
        C_edges.add(C_A);
        C_edges.add(C_E);
        C_edges.add(C_B);
        C_edges.add(C_D);
        C.edges = C_edges;

        ArrayList<Edge> D_edges = new ArrayList<Edge>();
        D_edges.add(D_E);
        D_edges.add(D_B);
        D_edges.add(D_C);
        D_edges.add(D_F);
        D.edges = D_edges;

        ArrayList<Edge> E_edges = new ArrayList<Edge>();
        E_edges.add(E_C);
        E_edges.add(E_D);
        E.edges = E_edges;

        ArrayList<Edge> F_edges = new ArrayList<Edge>();
        F_edges.add(F_D);
        F.edges = F_edges;

        HashMap<Node, List<Edge>> graph = new HashMap<Node, List<Edge>>();
        graph.put(A, A_edges);
        graph.put(B, B_edges);
        graph.put(C, C_edges);
        graph.put(D, D_edges);
        graph.put(E, E_edges);
        graph.put(F, F_edges);

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(A, graph);

    }

    public void dijkstra(Node startNode, HashMap<Node, List<Edge>> graph){

        // use priority queue
        Comparator<Node> comparator = new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.weightFromSource -o2.weightFromSource;
            }
        };

        HashSet<Node> visited = new HashSet<Node>();
        Queue<Node> queue = new PriorityQueue<Node>(comparator);
        HashMap<Node,Integer> total_cost = new HashMap<>();

        startNode.weightFromSource = 0; // set up original weight from source node
        total_cost.put(startNode,0); // add into total cost table

        // init total_cost table, for each node
        for (Node node : graph.keySet()) {
            if (node != startNode){
                total_cost.put(node,node.weightFromSource);
            }
        }

        HashMap<Node,Node> parent = new HashMap<>();
        queue.offer(startNode);

        while (!queue.isEmpty()){
            Node current = queue.poll();
            int cost = total_cost.get(current);
            visited.add(current);
            ArrayList<Node> neighbours = new ArrayList<>();

            for (int i = 0; i < current.edges.size(); i++) {
                Node temp = current.edges.get(i).destination;
                temp.weightFromSource = current.edges.get(i).weight; // update node weight
                neighbours.add(temp);
            }

            for (Node neighbour: neighbours) {
                if (!visited.contains(neighbour)) {
                    int new_cost = cost + neighbour.weightFromSource; // key point
                    if (total_cost.get(neighbour) > new_cost) {
                        total_cost.put(neighbour, new_cost);
                        parent.put(neighbour,current); // what is key ,what is value ??
                        queue.offer(neighbour);
                    }
                }
            }

        }

        for (Node node: parent.keySet()) {
            System.out.println(node.name + " -> " + parent.get(node).name);
        }

        for (Node node  : total_cost.keySet()) {
            System.out.println( total_cost.get(node) + " cost from A -> "+node.name );
        }

    }
}
