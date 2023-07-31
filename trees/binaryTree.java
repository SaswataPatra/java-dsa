package trees;
import java.util.*;
public class binaryTree {
    static Scanner sc = null;
    public static void main(String[]args){
        sc= new Scanner(System.in);
        Node root = createTree();
        System.out.println("In-order");
        inOrder(root);
        System.out.println("\nPre-order");
        preOrder(root);
        System.out.println("\nPost-order");
        postOrder(root);
    }

    static Node createTree(){
        Node root = null;
        
        System.out.println("Enter data");
        int data = sc.nextInt();

        if (data ==-1) return null;
        root = new Node(data);

        System.out.println("Enter the left data for "+ data);
        root.left = createTree();

        System.out.println("Enter the right data for "+data);
        root.right = createTree();

        return root;

    }

    static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}

     class Node{
        Node left,right;
        int data;

        public Node(int data){
            this.data = data;
        }
    }
