package leetCode;

public class MergeTwoSortedLists {
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
	
	private static ListNode merge(ListNode l1, ListNode l2) {
		
		ListNode temp = new ListNode(-1);
		ListNode temphead = temp;
		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				temp.next = l1;
				l1 = l1.next;
			}
			else {
				temp.next = l2;
				l2=l2.next;
			}
			temp = temp.next;
		}
		if(l1!=null) {
			temp.next = l1;
		}
		else {
			temp.next = l2;
		}
		return temphead.next;
	}

	public static void main(String[] args) {
		/*
		 * Given two sorted linked lists and output should be a merged sorted list
		 * Initiate a temp linked list with -1
		 * store this in a different head node(value we have is -1, we use this to eliminate this value in the output)
		 * So we take current nodes from both linked lists
		 * Iterate through loop until l1 && l2 are not null
		 * In the loop check if val of l1 is less than val of l2
		 * 		if yes, then we append l1 val to the temp linked list and move our l1 ref to next keeping the l2 same
		 * 		if no, then we append the l2 val to temp linked list and move our l2 ref to next keeping l2 same
		 * 		now we move our temp to temp.next
		 * after the loop it may still be possible that either l1 or l2 is not null
		 * so if l1 is not null we append l1 to the temp
		 * else we append l2 to the temp
		 * Finally return the temp head node which is holding -1 to avaoid sending the -1 to the result
		 */

		MergeTwoSortedLists l1 = new MergeTwoSortedLists();
		MergeTwoSortedLists l2 = new MergeTwoSortedLists();
		int[] nums = { 1, 2,4 };
		int[] nums2 = {1,3,4};
		for (int i : nums) {
			l1.addNode(new ListNode(i));
		}
		for (int i : nums2) {
			l2.addNode(new ListNode(i));
		}

		ListNode output = merge(l1.head, l2.head);
		while(output!=null) {
			System.out.println(output.val);
			output = output.next;
		}
		
		

	}


}
