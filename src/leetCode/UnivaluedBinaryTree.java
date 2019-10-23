package leetCode;

public class UnivaluedBinaryTree {

	public static void main(String[] args) {
		TreeNode root = null;  
	    root = insert(root, 1);  
	    insert(root, 1);  
	    insert(root, 1);  
	    insert(root, 1);  
	    insert(root, 1);  
	    insert(root, 1);  
	    insert(root, 1); 
	    
	    System.out.println(isUniVal(root));
		

	}
	private static boolean isUniVal(TreeNode root) {
		
		boolean left = root.left == null || root.left.val == root.val && isUniVal(root.left);
		boolean right = root.right == null || root.right.val == root.val && isUniVal(root.right);
		
		return left && right;
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
