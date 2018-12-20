package node;

public class Demo01 {
    public static void main(String[] args) {
        Node first = new Node();
        first.setValue(1);

        Node secound = new Node();
        secound.setValue(2);

        Node third = new Node();
        third.setValue(3);

        first.setNext(secound);
        secound.setNext(third);

        printNode(first);

    }

    public static void printNode(Node node){
        while (node!=null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

}
