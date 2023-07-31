package trees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Trees {
    static Scanner sc=null;
    public static void main(String[]args){
        List<Integer> res = new ArrayList<Integer>();
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root,res);
        System.out.println(res);
    }

    public static Node createTree(){
        Node root = null;

        System.out.println("Enter the data");
        int data = sc.nextInt();

        if (data==-1) return null;
        root = new Node(data);
        System.out.println("Enter the left data for "+ data);
        root.left = createTree();

        System.out.println("Enter the right data for "+ data);
        root.right = createTree();

        return root;
    }

    public static List<Integer> inOrder(Node root, List<Integer>res){
        if (root == null) return null;

        inOrder(root.left,res);
        res.add(root.data);
        inOrder(root.right,res);

        return res;

    }
}

class Node{
    Node left,right;
    int data;

    public Node(int data){
        this.data =data;
    }
}

