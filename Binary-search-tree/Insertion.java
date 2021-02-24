import java.util.*;



public class BinarySearchTree {
    
    
    
    private class Node  {
        int data;
        Node left;
        Node right;
    }
    
    private Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public Node insert(Node root,int data) {
        
        if(root == null ) {
            Node temp =  new Node();
            temp. data = data;
            return temp;
        }
        
        else if(root.data>data) {
            root.left  = insert(root.left,data);
        }
        else {
            root.right = insert(root.right,data);
        }
        return root;
    }
    
    public void inorder(Node root) {
        if(root!=null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        Node root = null;  
        root = bst.insert(root,50);
        root = bst.insert(root,30);
        root = bst.insert(root,20);
        root = bst.insert(root,40);
        root = bst.insert(root,70);
        root = bst.insert(root,60);
        root = bst.insert(root,80);
        
        bst.inorder(root);
    }
    
    
}
