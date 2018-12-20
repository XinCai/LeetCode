package node;

public class Demo02 {

    public static void main(String[] args) {
        ListListDemo listOne = new ListListDemo();

        Node node1= new Node();
        node1.setValue(1);

        Node node2 = new Node();
        node2.setValue(2);

        Node node3 = new Node();
        node3.setValue(3);

        listOne.AddToFront(node1);

        listOne.AddToFront(node2);

//        System.out.println(listOne.Count);
//        System.out.println(listOne.Head.getValue());
//        Demo01.printNode(listOne);

    }
}
