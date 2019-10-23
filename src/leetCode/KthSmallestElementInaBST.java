package leetCode;

import java.util.Stack;

public class KthSmallestElementInaBST {

	public static void main(String[] args) {
		TreeNode root = null;  
	    root = insert(root, 50);  
	    insert(root, 30);  
	    insert(root, 20);  
	    insert(root, 40);  
	    insert(root, 70);  
	    insert(root, 60);  
	    insert(root, 80); 
	    
	    System.out.println(kthsmallest(root, 3));
		

	}
	private static int kthsmallest(TreeNode root, int i) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int count =1;
		TreeNode curr = root;
		while(true) {
			while(curr!=null) {
				stack.push(curr);
				curr=curr.left;
			}
			curr = stack.pop();
			if(count==i) {
				return curr.val;
			}
			count ++;
			curr = curr.right;
		}
	
	}
	static TreeNode insert(TreeNode node, int key)  
	{  

	    if (node == null) return new TreeNode(key);  
	  
	    if (key < node.val)  
	        node.left = insert(node.left, key);  
	    else if (key > node.val)  
	        node.right = insert(node.right, key);  
	    return node;  
	}

}
