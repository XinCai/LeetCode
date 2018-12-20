package DFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    /**
     * use recursion to Depth first search
     * @param startNode
     * @param visited
     */
    public void dfs(Vertex startNode, HashSet<Vertex> visited){
        visited.add(startNode);
        System.out.println("Visiting " + startNode.name);
        for (Vertex current : startNode.adjList) {
            if (!visited.contains(current)){
             dfs(current,visited);
            }
        }
    }

    /**
     * use stack to implement Depth first search
     * @param startNode
     */
    public void dfs(Vertex startNode){
        HashSet<Vertex> visited = new HashSet<Vertex>();
        Stack<Vertex> dfsStack = new Stack<Vertex>();
        dfsStack.add(startNode);
        visited.add(startNode);

        while (!dfsStack.isEmpty()){
            Vertex current = dfsStack.pop();
            System.out.println(current.name);

            if (!visited.contains(current)){
                visited.add(current);
            }

            for (Vertex node: current.adjList) {
                if (!visited.contains(node)){
                    dfsStack.push(node);
                }
            }
        }
    }

    /**
     *   Graph :
     *
     *   A - B - D - E - F - G
     *  /  \
     *  C   H
     *
     *   DFS should output A H C B D E F G
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexG = new Vertex("G");
        Vertex vertexH = new Vertex("H");

        LinkedList<Vertex> adjListA= new LinkedList<Vertex>();
        adjListA.add(vertexC);
        adjListA.add(vertexH);
        adjListA.add(vertexB);
        vertexA.adjList = adjListA;

        LinkedList<Vertex> adjListB= new LinkedList<Vertex>();
        adjListB.add(vertexA);
        adjListB.add(vertexD);
        vertexB.adjList = adjListB;

        LinkedList<Vertex> adjListC= new LinkedList<Vertex>();
        adjListC.add(vertexA);
        vertexC.adjList = adjListC;

        LinkedList<Vertex> adjListD= new LinkedList<Vertex>();
        adjListD.add(vertexB);
        adjListD.add(vertexE);
        vertexD.adjList = adjListD;

        LinkedList<Vertex> adjListE= new LinkedList<Vertex>();
        adjListE.add(vertexD);
        adjListE.add(vertexF);
        vertexE.adjList = adjListE;

        LinkedList<Vertex> adjListF= new LinkedList<Vertex>();
        adjListF.add(vertexE);
        adjListF.add(vertexG);
        vertexF.adjList = adjListF;

        LinkedList<Vertex> adjListG= new LinkedList<Vertex>();
        adjListG.add(vertexF);
        vertexG.adjList = adjListG;

        LinkedList<Vertex> adjListH= new LinkedList<Vertex>();
        adjListH.add(vertexA);
        vertexH.adjList = adjListH;


        DFS dfs = new DFS();
        dfs.dfs(vertexA, new HashSet<>());

        System.out.println("=========================");
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);

        dfs.dfs(vertexA);

        // expect output
//
//        Visiting A
//        Visiting C
//        Visiting H
//        Visiting B
//        Visiting D
//        Visiting E
//        Visiting F
//        Visiting G
    }
}
