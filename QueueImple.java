package datastructers;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class QueueImple {

    public static void main(String[] args) {

    }

    ArrayList<String> queue;
    int pointer;

    public QueueImple(){
        queue = new ArrayList<>();
        pointer = 0; // pointer to head of queue
    }

    /**
    add()队尾追加元素
     **/

    public void add(String item){
        this.queue.add(item); // FIFO
    }

    public boolean isEmpty(){

        if (this.queue.size() == 0){
            return true;
        }else {
            return false;
        }
    }

    public int size(){
        return this.queue.size() - pointer;
    }

    public String poll(){
        if(queue.size() == 0){
            return null;
        }

        return this.queue.get(pointer++);
    }



}
