package trees;

import java.util.ArrayList;
import java.util.*;
// Iterative Queue based Java program
// to do level order traversal
// of Binary Tree

/* importing the inbuilt java classes
required for the program */
import java.util.LinkedList;
import java.util.Queue;

/* Class to represent Tree node */
class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = null;
		right = null;
	}
}

/* Class to print Level Order Traversal */
class levelOrder {

	Node root;

	/* Given a binary tree. Print
	its nodes in level order
	using array for implementing queue */
	void printLevelOrder()
	{
		Queue<Node> q = new LinkedList<>();
        q.add(root);
        // q.add(null);  //not working
        while(!q.isEmpty()){
            Node curr = q.poll();
            // if(curr==null){ //not working
            //     if(q.isEmpty()){
            //         return;
            //     }
            //     q.add(null);
            //     System.out.println();
            // }
            System.out.print(curr.data +" ");
            
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
	}

    public List<List<Integer>> levelOrders(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int currSize = q.size();
            for(int i =0; i<currSize;i++){
                Node node = q.poll();

                if(node!=null){
                    level.add(node.data);

                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if (level.size()>0) res.add(level);
        }
        return res;
        
    }

	public static void main(String args[])
	{
		/* creating a binary tree and entering
		the nodes */
		levelOrder tree_level = new levelOrder();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.printLevelOrder();
        System.out.println(tree_level.levelOrders());
	}
}
