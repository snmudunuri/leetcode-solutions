package leetCode;

public class PalindromeLinkedList {
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

		PalindromeLinkedList test = new PalindromeLinkedList();
		int[] nums = { 1, 2, 2, 1 };
		for (int i : nums) {
			test.addNode(new ListNode(i));
		}

		System.out.println(isPalindrome(test.head));
		
		

	}

	private static Boolean isPalindrome(ListNode NodeHead) {
		ListNode slow = NodeHead;
		ListNode fast = NodeHead;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = NodeHead;
		while(slow!=null) {
			if(slow.val!=fast.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
			
		
	}
		return true;
	}

}
