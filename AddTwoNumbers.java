class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumbers {
	public static void Main(String[] args) {
		ListNode a1 = new ListNode(6);
		a1.next = new ListNode(2);
		a1.next.next = new ListNode(4);

		ListNode a2 = new ListNode(7);
		a2.next = new ListNode(5);
		a2.next.next = new ListNode(6);

		AddTwoNumbers sum = new AddTwoNumbers();

		sum.PrintListNode(sum.addTwoNumbers(a1, a2));

	}

	public void PrintListNode(ListNode li) {

		while (li != null) {
			System.out.print(" " + li.val);
			li = li.next;
		}
	}

	public ListNode addTwoNumbers(ListNode a1, ListNode a2) {

		ListNode dummy = new ListNode(0);
		int carry = 0;
		ListNode p = a1; // point p to Linklist a1
		ListNode q = a2; // point q to Linklist a2
		ListNode current = dummy;

		/*
		 * logical or
		 */
		while (p != null || q != null) {
			int x;
			int y;

			if (p != null) {
				x = p.val;
			} else {
				x = 0;
			}

			if (q != null) {
				y = q.val;
			} else {
				y = 0;
			}

			int sum = x + y + carry; // already consider , if carry = 1 , add x
										// , y , carry

			carry = sum / 10; // again, calculate

			current.next = new ListNode(sum % 10);

			if (p != null) {
				p = p.next;
			}

			if (q != null) {
				q = q.next;
			}

		}

		if (carry > 0) {
			current.next = new ListNode(carry);
		}

		return dummy;
	}
}
