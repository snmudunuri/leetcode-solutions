package leetCode;

public class ReverseLinkedList {
	ListNode head;

	static ListNode reverse(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;

	}

	void addNode(ListNode newNode) {
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinkedList test = new ReverseLinkedList();
		int[] nums = { 1, 2,3,4 };
		for (int i : nums) {
			test.addNode(new ListNode(i));
		}

		ListNode output = reverse(test.head);
		while(output!=null) {
			System.out.println(output.val);
			output = output.next;
		}
		
		

	}


}
