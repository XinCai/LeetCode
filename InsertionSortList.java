package lintcode;


class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1(int x) {
          val = x;
          next = null;
      }
  }

public class InsertionSortList {
    /**
     *  1->3->2->0->null
     *  1->3->2->0->4->null
     *  sorting
     * * @param args
     */

    public static void main(String[] args) {
        ListNode1 n1 = new ListNode1(1);
        ListNode1 n2 = new ListNode1(2);
        ListNode1 n3 = new ListNode1(3);
        ListNode1 n0 = new ListNode1(0);
        ListNode1 n4 = new ListNode1(4);

        n1.next = n3;
        n3.next = n2;
        n2.next = n0;
        n0.next = n4;

        printList(n1);
        ListNode1 curr = middleNode(n1);
        System.out.println("middle node: " + curr.val);
        deleteNode(curr);
        printList(n1);
        //insertionSortList(n1);
    }

    public static void printList(ListNode1 head){
        while (head!=null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(" ");
    }

    /**
     *  given a target node, to delete this one from list
     *  1) copy the value from next node,
     *  2) point current node to curr.next.next
     *  3) remove the deleteNode -> shift to remove the deleteNode.next node
     *
     *
     * @param deletedNode
     */
    public static void deleteNode(ListNode1 deletedNode){

        deletedNode.val  = deletedNode.next.val;
        deletedNode.next = deletedNode.next.next;
    }

    public static ListNode1 middleNode(ListNode1 head) {
        if (head == null) {
            return null;
        }

        ListNode1 slow = head;
        ListNode1 fast = slow.next;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return slow;
    }

    public static ListNode1 insertionSortList(ListNode1 head) {
        ListNode1 dummy = new ListNode1(0);
        // 这个dummy的作用是，把head开头的链表一个个的插入到dummy开头的链表里
        // 所以这里不需要dummy.next = head;

        while (head != null) {
            ListNode1 node = dummy;
            while (node.next != null && node.next.val < head.val) {
                node = node.next;
            }
            ListNode1 temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }

        return dummy.next;
    }

}
