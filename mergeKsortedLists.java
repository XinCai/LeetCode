package lintcode;

import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
          this.next = null;
      }
  }

public class mergeKsortedLists {

    public static void main(String[] args) {
        // [2->4->null,null,-1->null]
        ArrayList<ListNode> ls = new ArrayList<>();
        ListNode n10 = new ListNode(2);
        ListNode n11 = new ListNode(4);
        n10.next = n11;

        ListNode n2 = null;

        Integer[] arr1 = {5,2,1,61,2,6,71,22};
        //Arrays.sort(Collections.reverseOrder(), arr1);
        Arrays.sort(arr1,Collections.reverseOrder());

        ListNode n3 = new ListNode(-1);

        ls.add(n10);
        ls.add(n2);
        ls.add(n3);
        mergeKLists(ls);
    }

    public static ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>( lists.size(),new Comparator<ListNode>(){

            @Override
            public int compare(ListNode o1, ListNode o2){
                return o1.val - o2.val;
            }
        });


        for (int i=0; i< lists.size() ; i++) {
            queue = addIntoQueue(queue, lists.get(i));
        }

        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(!queue.isEmpty()){
            res.next = queue.poll();
            res = res.next;
        }

        return temp.next;

    }

    public static PriorityQueue addIntoQueue(PriorityQueue<ListNode> pq, ListNode head){
        if(head == null){
            return pq;
        }

        ListNode curr = head;

        while(curr!=null){
            pq.offer(curr);
            curr = curr.next;
        }

        return pq;
    }
}
