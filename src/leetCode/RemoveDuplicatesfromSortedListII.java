package leetCode;

public class RemoveDuplicatesfromSortedListII {
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
	
	private static ListNode removeDuplicates(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		if(head.val!=head.next.val) {
			head.next = removeDuplicates(head.next);
			return head;
		}
		ListNode nextNonDuplicate = head;
		while(nextNonDuplicate!=null && nextNonDuplicate.val == head.val) {
			nextNonDuplicate = nextNonDuplicate.next;
		}
		return removeDuplicates(nextNonDuplicate);
		
	}

	public static void main(String[] args) {
		/*
		 * Given a sorted linked list
		 * So from the above statement, if a duplicate is found in the linked list it would next to each other
		 * so we will solve this using recursive method
		 * Logic:
		 * 		Step1:
		 * 			if head or head.next is null. return the head
		 * 		Step2:
		 * 			Check if head.val != head.next.val
		 * 				if yes, then call the deleteDuplicates function on head.next and return head
		 * 		step 3:
		 * 			Create a dummy node to track the next unique val and initiate it to the current head
		 * 		step 4:
		 * 			run a while loop until dummy node becomes null or dumm.val not equals the head.val
		 * 			and move the dummy node to next node 
		 * 			in this we find the next value that is not a duplicate
		 * 		step 5:
		 * 			again call the deleteDUplicates function on the dummy node
		 * 
		 *  This will recursively call the delete function and finally return the head node with no duplicates in it
		 * 	
		 * 
		 */

		RemoveDuplicatesfromSortedListII l1 = new RemoveDuplicatesfromSortedListII();
		
		int[] nums = { 1,2,3,3,4,4,5 };
		for (int i : nums) {
			l1.addNode(new ListNode(i));
		}
		
		ListNode output = removeDuplicates(l1.head);
		while(output!=null) {
			System.out.println(output.val);
			output = output.next;
		}
		
		

	}


}
