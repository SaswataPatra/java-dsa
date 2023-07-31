package trees;

public class InsertBST {

    Node insert(Node root, int key){
        if (root==null) return new Node(key);
        if(root.data>key) root.left = insert(root.left, key);
        else if(root.data<key) root.right = insert(root.right, key);

        return root;
    }

    Node iterinsert(Node root,int key){
        Node node = new Node(key);

        Node parent = null;
        Node cur = root;

        while(cur!=null){
            parent = cur;
            if(cur.data>key) cur = cur.left;
            else if (cur.data<key) cur = cur.right;
        }

        if(parent==null) return node;

        if(parent.data>key) parent.left = node;
        else if (parent.data<key) parent.right = node;

        return root;
    }
}
