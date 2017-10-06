public class LinkListDemo {

	public static void main(String[] args) {
		LinkList mylist = new LinkList();
		mylist.appendNode(3);
		mylist.appendNode(5);
		mylist.appendNode(7);

		mylist.Print();

		LinkList mylist2 = new LinkList();
		mylist2.appendNode(5);
		mylist2.appendNode(6);
		mylist2.appendNode(7);

		mylist2.Print();

	}
}

/*
 *
 * 	
 */
class LinkNode {
	int val;
	LinkNode next;

	LinkNode(int x, LinkNode nextNode) {
		val = x;
		this.next = nextNode;
	}
}

class LinkList {

	public int listSize;
	public LinkNode head;

	public LinkList() {
		listSize = 0;
	}

	public void appendNode(int x) {
		LinkNode end = new LinkNode(x, null);
		LinkNode current = head;

		if (current == null) {
			current = end;
			head = current;
			listSize++;
			return;
		}

		while (current.next != null) {
			current = current.next;
		}
		current.next = end;
		listSize++;
	}

	public boolean isEmpty() {

		return (head == null);
	}

	public void Print() {

		if (head == null) {
			System.out.print("linked list is null");
			return;
		}

		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	/**
	 * 
	 * @param x
	 */
	public void deleteNode(LinkNode x) {
		if (head == null) {
			System.out.print("link list is empty, nothing can be deleted");
			return;
		} else {

		}
	}
}
