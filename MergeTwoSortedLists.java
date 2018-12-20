package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode res =  mergeTwoLists2(l1,l2);

        System.out.println(res);


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;

    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode mergeHead = l1;

        System.out.println(l1.val);
        System.out.println(l2.val);
//        if(l1.val < l2.val){
//            mergeHead = l1;
//            mergeHead.next = mergeTwoLists(l1.next, l2);
//        }
//        else{
//            mergeHead = l2;
//            mergeHead.next = mergeTwoLists(l1, l2.next);
//        }
        return mergeHead;

    }

}
