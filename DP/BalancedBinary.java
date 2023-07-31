package DP;
/* Java program to determine if binary tree is
height balanced or not */

/* A binary tree node has data, pointer to left child,
and a pointer to right child */
class Node {
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class BalancedBinary {
	Node root;

	// static boolean isBalanced(Node root){
    //     if (root ==null ) return true;

    //     int lh = find_height(root.left);
    //     int rh = find_height(root.right);
    //     if(Math.abs(lh-rh)==1||(lh==0&&rh==0)) return true;

    //     return false;
    // }

    // static int find_height(Node node){
    //     if (node==null) return 0;
    //     return 1 + Math.max(find_height(node.left), find_height(node.right));
    // }

    public static boolean isBalanced(Node root) {
        if(root==null) return true;
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        return left!=-1&&right!=-1&&Math.abs(left-right)<=1;
    }
    
    private static int checkBalance(Node root){
        if(root==null) return 0;
        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        if(left==-1||right==-1||Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }
    //[1,2,2,3,null,null,3,4,null,null,4]
	public static void main(String args[])
	{
		BalancedBinary tree = new BalancedBinary();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.left.left = new Node(4);
        tree.root.left.left.left.left = new Node(5);


		if (isBalanced(tree.root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}
}

// This code has been contributed by Mayank Jaiswal(mayank_24)

