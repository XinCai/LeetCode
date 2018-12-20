package node;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 *
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 *  10 % 10 = 0
 *  11 % 10 = 1
 *  12 % 10 = 2
 *
 *  curry = 11 / 10 = 1
 *  curry = 12 / 10 = 1
 *  curry = 13 / 10 = 1
 *
 *
 */

public class AddTwoNumbers {

    public static void main(String[] args) {

//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//
//        ListNode l2 = new ListNode(5);
//        l2.next  = new ListNode(6);
//        l2.next.next = new ListNode(4);

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode temp =addTwoNumbers2(l1,l2);

        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tempHead = new ListNode(0); // as temp head pointer
        ListNode result = tempHead; // create another pointer , point to same position
        int sum = 0;

        while (l1 != null || l2 != null) {
            sum = sum / 10; // give carry if the previous sum is greater than 10
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            tempHead.next = new ListNode(sum % 10);
            tempHead = tempHead.next;

        }
        if (sum / 10 == 1){
            tempHead.next = new ListNode(1);
        }

        return result.next;
    }

    public static  ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        ListNode t1 = l1, t2 = l2;  // always operate on temp pointer , don't operate on passed in value

        ListNode result = new ListNode(0); // create new head node, which will be return as result head node.
        ListNode tempHead = result; // create new temp node, pointer to same result node, operate on temp node, looping , continue move to next node.

        int sum = 0; // save a sum value

        while (t1!=null || t2!=null ){ //case,  t1 is null, t2 is not null , go to looping; t1 is not null, t2 is null, go in to loop. both are null, skip looping.
            sum = sum/10;  // if
            if (t1!=null){
                sum = sum + t1.val;
                t1 = t1.next; // move to next node
            }
            if (t2!=null){
                sum = sum + t2.val;
                t2 = t2.next; // move t2 to next pointer
            }

            // becaureful here , result node must add new node as next node , then move to next
            tempHead.next = new ListNode(sum % 10); // create new node , assign to next node
            tempHead = tempHead.next; // move to next node
        }

        //edge case , if the last one sum == 10 , then create new node
        if (sum/10 == 1){
            tempHead.next = new ListNode(1);
        }
        return result.next;
    }
}
