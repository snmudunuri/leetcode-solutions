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
		/*
		 * If we reverse the given head straight away we will end up modifying the head and
		 * we will only have the final node in our current list
		 * so we need to split the lined list into two parts
		 * for that we take two nodes fast and slow
		 * fast will move one step faster than the slow both starting at the head node
		 * we move fast node until fast or fast.next is null
		 * we will end up with fast at end of the node and slow at mid node
		 * now set the fast to head of the node
		 * reverse the slow node and that will reverse the second part of the node
		 * after reversal we will traverse slow and fast at the same pace
		 * and compare values for each
		 * if we find a value that's not matching we will return false
		 * after the loop if we still didn't return anything means we have a palindrome and we return ture
		 * 
		 */
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
