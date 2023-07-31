package trees;

import java.util.*;

class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class LeftSideView {
	Node root;
    static int max_level =0;

    //Using recursion and the concept that the first item in the level sublist corresponds to an element of LSV
    void LeftViewUtil(Node node, int level){
        if(node==null) return;
        
        if(max_level<level){//this means that first time this level is being reached
            System.out.println(" "+node.data);
            max_level=level; //This works like a flag until the next level is reached
        }
        LeftViewUtil(node.left, level+1);
        LeftViewUtil(node.right, level+1);

    }

    void LeftView(){
        LeftViewUtil(root,1);
    }

    static void PrintLeftSideViewUtil(Node root){
        if( root==null) return;
        List<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
            int currSize = q.size();
            for(int i=0;i<currSize;i++){

            Node node = q.poll();
                if(i==0){
                    res.add(node.data);
                }
               if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
        System.out.println(res); 
    }
     void PrintLeftSideView(){
        PrintLeftSideViewUtil(root);
    }

	public static void main(String args[])
	{
		LeftSideView tree = new LeftSideView();
		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(8);
		tree.root.right.right = new Node(15);
		tree.root.right.left = new Node(12);
		tree.root.right.right.left = new Node(14);
		
	

		// tree.LeftView();
        
        tree.PrintLeftSideView();
        
	}
}

