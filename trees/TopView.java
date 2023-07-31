package trees;

// Java program to print top
// view of binary tree
import java.util.*;

// class to create a node
class Node {
	int data;
	Node left, right;

	public Node(int data)
	{
		this.data = data;
		left = right = null;
	}
}
class TreeNode{
    int data;
    TreeNode left,right;

    public TreeNode(int data){
        this.data = data;
        left = right =null;
    }
}
class Pairs{
    int hd;
    TreeNode node;

    public Pairs(int data,TreeNode node){
        this.hd = data;
        this.node = node;
    }
}
class Pair{
    int hd;
    Node node;

    public Pair(int hd, Node node){
        this.hd = hd;
        this.node = node;
    }
}

// class of binary tree
class TopView {
	Node root;
    TreeNode roots;

    static List<Integer> topViewUtil(Node root)
    {   Map<Integer,Integer> map = new TreeMap<>();
        List<Integer> res = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();

        Pair pair = new Pair(0, root);
        q.add(pair);
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }
            if(curr.node.left!=null) q.add(new Pair(curr.hd-1,curr.node.left));
            if(curr.node.right!=null) q.add(new Pair(curr.hd+1, curr.node.right));
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;    
    }
    public List<List<Integer>> verticalTraversal(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<>();

        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            // int currSize = q.size();

                Pair curr = q.poll();
                if(curr.node!=null){
                   if(map.containsKey(curr.hd)) level = map.get(curr.hd);
                    level.add(curr.node.data);
                    map.put(curr.hd, level);
                }
                if(curr.node.left!=null) q.add(new Pair(curr.hd-1,curr.node.left));
                if(curr.node.right!=null) q.add(new Pair(curr.hd+1,curr.node.right));
            }
        
        // for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
        //     res.add(entry.getValue());
        // }
        // List<Integer> columnList = new ArrayList<Integer>();
            for(Integer rowKey: map.keySet()) {
                List<Integer> row = map.get(rowKey);
                Collections.sort(row);
                res.add(row);
            }
            
        return res;
    }
    void vertTrav(){
        System.out.println( verticalTraversal(root));
    }

    void topView(){
        System.out.println( topViewUtil(root));
    }
	// Driver Program to test above functions
	public static void main(String[] args)
	{
		/* Create following Binary Tree
		 1
		/ \
		2  3
		 \
		  4
		   \
			5
			 \
			  6*/
		TopView tree = new TopView();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(6);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(7);
		System.out.println(
			"Following are nodes in top view of Binary Tree");
        tree.vertTrav();
		// tree.topView();
        
	}
}

