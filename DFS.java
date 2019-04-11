package datastructers;


import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

class GraphNode{
    String value;
    List<GraphNode> neighbours;

    public GraphNode(String value) {
        this.value = value;
        neighbours = new ArrayList<GraphNode>();
    }
}

public class DFS {
    public static void main(String[] args) {

    }

    public void dfs(GraphNode startNode){
        HashSet<GraphNode> visited = new HashSet<>();
        Stack<GraphNode> stack = new Stack<>();

    }
}
