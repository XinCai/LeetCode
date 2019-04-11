package datastructers;


import java.util.HashSet;

class ListNode{
        int val;
        ListNode next;

        ListNode(int val)
        {
            this.val = val;
            this.next = null;
        }
}

public class LinkedListDmeo {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListNode curr = n1;
        HashSet<Integer> set = new HashSet<Integer>();

        while (curr !=null){
            set.add(curr.val);
            curr = curr.next;
        }

        System.out.println(set.size());

        for (Integer node: set) {

        }

    }

}
