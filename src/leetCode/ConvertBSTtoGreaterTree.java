package leetCode;


public class ConvertBSTtoGreaterTree {

	public static void main(String[] args) {
		TreeNode root = null;  
	    root = insert(root, 5);  
	    insert(root, 2);  
	    insert(root, 13);  
	    printInorder(convertToGreaterTree(root));

	}
	private static void printInorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(node.val + " "); 
        printInorder(node.right); 
    } 
	private static int sum=0;
	private static TreeNode convertToGreaterTree(TreeNode root) {
		if(root!=null) {
			convertToGreaterTree(root.right);
			sum = sum + root.val;
			root.val = sum;
			convertToGreaterTree(root.left);
			
		}

		return root;
		
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
