package lintcode;

class ListNodeA {
      int val;
        ListNodeA next;
        ListNodeA(int x) {
          val = x;
          next = null;
      }
}

public class SortList {

    /**
     * Input: 1->7->2->6->null
     *
     *
     *
     * 1->-1->null
     * @param args
     */

    public static void main(String[] args) {
        ListNodeA n1 = new ListNodeA(1);
        ListNodeA n7 = new ListNodeA(7);
        ListNodeA n2 = new ListNodeA(2);
        ListNodeA n6 = new ListNodeA(6);
//
//        n1.next = n7;
//        n7.next = n2;
//        n2.next = n6;
//
//
        ListNodeA n0 = new ListNodeA(-1);
        n1.next = n0;

        SortList sortList = new SortList();
        sortList.printList(n1);
        ListNodeA res =  sortList.mergeSort(n1);

        sortList.printList(res );


    }

    public void printList(ListNodeA head){
        while (head != null){
            System.out.print( head.val + " -> ");
            head = head.next;
        }
    }

    public ListNodeA mergeSort(ListNodeA head){
        if(head == null || head.next == null){
            return head;
        }

        ListNodeA temp = head;

        ListNodeA middle = getMiddle(head);

        ListNodeA middleNext = middle.next;
        middle.next = null;

        ListNodeA left = mergeSort(temp);
        ListNodeA right = mergeSort(middleNext);

        ListNodeA res = merge(left, right);
        return res;
    }

    public ListNodeA merge(ListNodeA l1, ListNodeA l2){

        ListNodeA dummyNode = new ListNodeA(0);
        ListNodeA res = dummyNode;

        while(l1!=null && l2!=null){
            if(l1.val > l2.val){
                dummyNode.next = l2;
                l2 = l2.next;
            }else{
                dummyNode.next = l1;
                l1 = l1.next;
            }
            dummyNode = dummyNode.next;
        }

        if(l1!=null){
            dummyNode.next = l1;
        }

        if(l2!=null){
            dummyNode.next = l2;
        }

        return res.next;

    }



    public ListNodeA getMiddle(ListNodeA head) {

        ListNodeA slow = head;
        ListNodeA fast = head.next;

        while(fast!=null){

            fast = fast.next;
            if(fast !=null){
                fast = fast.next;
            }
            slow = slow.next;
        }

        return slow;

    }
//        ListNodeA slow = head;
//        ListNodeA fast = head.next;
//
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;


}
