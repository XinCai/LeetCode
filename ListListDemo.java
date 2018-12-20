package node;

public class ListListDemo {
    /**
     * add to front (start of the list)
     *
     * add to end (end of the list)
     */
    int Count;
    public Node Head = null;
    public Node Tail = null;

    public void AddToFront(Node node){

        Node temp = Head; // save Head into temp
        Head = node; // assign new node to head
        Head.setNext(temp); // point new head next -> temp node

        /**
         * increase counter by 1
         */
        this.Count++;

        /**
         * if the list was empty then Head and Tail should both point to the new node
         */
        if (Count==1){
            Tail = Head;
        }
    }

    public void AddToEnd(Node node){
        if(Count == 0){
            Head = node;
        }else {
            Tail.setNext(node);
        }

        Tail = node;
        Count++;

    }
}
