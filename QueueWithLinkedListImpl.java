package datastructers;



public class QueueWithLinkedListImpl {

    private class  Node {
        int data;
        Node next;
    }

    private Node front, rear;
    private int currentSize;

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty(){
        return (currentSize == 0);
    }

    public int dequeue(){
        if (isEmpty()){
            this.front = this.rear = null;
            return this.front.data;
        }else {
            int data = front.data;
            front = front.next;
            currentSize--;
            return data;
        }
    }

    public void enqueue(int data){
        Node newAdd= new Node();
        newAdd.data = data;

        if (isEmpty()){
            this.rear = newAdd;
            this.rear.next = null;
            this.front = this.rear;
            currentSize++;
        }else {

        }


        Node oldRear = rear;

        rear = new Node();
        rear.data = data;
        rear.next = null;

        oldRear.next = rear;
        currentSize++;
    }
}
