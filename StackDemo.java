package DataStructure;

public class StackDemo {

    private int stackSize; // the length of stack
    private int[] stackArr; // array , which repetitive for stack
    private int top; // index of stack

    /**
     * constructor to create stack with size
     * @param size
     */
    public StackDemo(int size){
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }

    public void push(int entry) throws Exception {
          if (this.isStackFull()){
            throw new Exception("Stack is Full, can not add element");
        }
        System.out.println("adding "+entry);
        this.stackArr[++top]=entry;
    }

    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public int peek() {
        return stackArr[top];
    }

    public int pop() throws Exception {
        if (this.isStackEmpty()){
            throw new Exception("Stack is Empty, can not remove element");
         }

        int entry  = this.stackArr[top--];
        System.out.println("Removed entry: " + entry);
        return entry;
    }

    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    /**
     * This method returns true if the stack is
     * empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) throws Exception {

        StackDemo demo = new StackDemo(5);

        demo.push(3);
        System.out.println("top of stack is:" + demo.peek());
        demo.push(4);
        System.out.println("top of stack is:" + demo.peek());
        demo.push(5);
        System.out.println("top of stack is:" + demo.peek());
        demo.push(6);
        System.out.println("top of stack is:" + demo.peek());
        demo.pop();
        System.out.println("top of stack is:" + demo.peek());
        demo.push(7);
        demo.push(8);
        demo.push(9);

        for (int i=0; i<demo.stackArr.length;i++)
        System.out.printf(String.valueOf(demo.stackArr[i]));
    }

}
