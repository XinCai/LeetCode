package DFS;

import java.util.LinkedList;

public class Vertex {
    String name;
    LinkedList<Vertex> adjList;

    public Vertex(String name) {
        this.name = name;
    }
}
