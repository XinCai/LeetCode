package Leetcode;

public class reverseLinkedList {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        print(n1);
        System.out.println("  -- ");
        print(reverse(n1));

    }

    private static void print(ListNode head){
        while (head!=null){
            System.out.print(head.val + " ->");
            head = head.next;
        }
    }

    public static ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }

        ListNode previousNode = null;
        ListNode current = head;
        ListNode next = null; // store next element

        /**
         *
         */
        while (current!=null){
            next = current.next;
            current.next = previousNode;
            previousNode = current;
            current = next;
        }

        return previousNode;
    }

}
