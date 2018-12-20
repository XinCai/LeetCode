package WeightGraph;

public class Edge {
    private Node source;
    private Node destination;
    private int length;

    public Edge(Node source, Node destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.length = weight;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /**
     * determine the neighbouring node of suppiled node , based on the two nodes connected by this edge
     * @param node
     * @return
     */
    public Node getNeighbourNode(Node node){
        if (this.source == node){
            return this.destination;
        }else {
            return this.source;
        }

    }
}
