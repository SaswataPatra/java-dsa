package trees;
import java.util.*;
class TreeNode {
	int val;
	TreeNode left, right;

	public TreeNode(int item,TreeNode left,TreeNode right)
	{
		this.val = item;
		this.left = left;
        this.right = right;
	}
}
public class InvertTree {
    TreeNode root;
    static int max_val = Integer.MIN_VALUE;
   //Using the logic that last element of the level list will give RSV
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int currSize = q.size();
            
            for(int i=0;i<currSize;i++){
                TreeNode node = q.poll();
                
                if(node!=null){
                    level.add(node.val);
                    
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if(level.size()>0) res.add(level.get(level.size()-1));
        }
     return res;   
    }
    //using set method of array list which appends every element in a level with the coming one hence we get the last element RSV
    public List<Integer> rightSideViewSet(TreeNode node, List<Integer> res, int level){
        if (node ==null) return null;
        if(max_val < level){
            res.add(node.val);
            max_val = level;
        }
        res.set(level,node.val);

        rightSideViewSet(node.left,res,level+1);
        rightSideViewSet(node.right,res,level+1);

        return res;
    }
    //[1,null,3]
    void rightSideViewCall(){
        List<Integer> res = new ArrayList<>();
        System.out.println( rightSideViewSet(root,res,0));
        System.out.println( rightSideView(root));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        return new TreeNode(root.val,invertTree(root.right),invertTree(root.left));
        
    }
   
    void controller(){
        invertTree(root);
    }
    public static void main(String args[])
	{
		/* creating a binary tree and entering the nodes */
		InvertTree tree = new InvertTree();
        // tree.root = new TreeNode(1);
        // tree.root.right = new TreeNode(3);

		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(7);
		tree.root.left.right = new TreeNode(8);
		tree.root.right.right = new TreeNode(15);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right.left = new TreeNode(14);
		
        // tree.rightSideViewCall();

        tree.controller();
	}

}
