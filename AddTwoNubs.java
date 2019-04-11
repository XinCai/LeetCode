package Leetcode;

class ListNode{
    public ListNode(int val) {
        this.val = val;
    }

    int val;
    ListNode next;

}

/**
 *
 *   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *   Output: 7 -> 0 -> 8
 *   Explanation: 342 + 465 = 807.
 *
 */
public class AddTwoNubs {
    public ListNode addTwoNumbers(ListNode n1, ListNode n2){
        ListNode res = new ListNode(0);
        ListNode tmpHead = res;

        int sum = 0;

        while (n1!=null || n2!=null){
            sum = sum / 10; // sum=15 , 15/10 => sum = 1 , consider the carry forward result
            if (n1!=null){
                sum = sum + n1.val;
                n1 = n1.next;
            }

            if (n2!=null){
                sum = sum + n2.val;
                n2 = n2.next;
            }

            ListNode tmp = new ListNode(sum % 10); // 15 % 10 => 5
            tmpHead.next = tmp;
            tmpHead = tmpHead.next;

        }

        return res.next;
    }

    public static void main(String[] args) {
        int sum = 12;
        System.out.println(sum%10);
        System.out.println(sum/10);
    }
}
