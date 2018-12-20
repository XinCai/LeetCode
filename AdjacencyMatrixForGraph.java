package BFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrixForGraph {
    private boolean[][] adjMatrix;
    private int numVertex;

    //无向图 使用 邻接矩阵 来表示
    public AdjacencyMatrixForGraph(int numVertex) {
        this.numVertex = numVertex;
        adjMatrix =  new boolean[numVertex][numVertex];
    }

    public void addEdge(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }


    public void BFS(int startVertex, AdjacencyMatrixForGraph adjcentMatrixGraph){
        HashMap<Integer,Boolean> visitedVertex = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        visitedVertex.put(startVertex,true);
        queue.add(startVertex);

        int numsVertex = adjcentMatrixGraph.numVertex;

        while (!queue.isEmpty()){
            int top = queue.poll();
            System.out.println("current ele " + top);

            for (int i = 0; i < numsVertex; i++) {
                if (!visitedVertex.containsKey(i) && adjcentMatrixGraph.adjMatrix[top][i] == true){
                    queue.add(i);
                    visitedVertex.put(i,true);
                }
            }

        }
    }

    public static void main(String[] args) {
        /**
         *    0  -- 2  -- 3
         *    |  /  |   /
         *    1  ---  4
         *
         */
        AdjacencyMatrixForGraph graph = new AdjacencyMatrixForGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,0);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,0);
        graph.addEdge(2,1);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(3,2);
        graph.addEdge(3,4);
        graph.addEdge(4,1);
        graph.addEdge(4,2);
        graph.addEdge(4,3);

        graph.BFS(0,graph); // expect output : 0 ,1 ,2 4,3

    }

    public int getNumVertex() {
        return numVertex;
    }
}
