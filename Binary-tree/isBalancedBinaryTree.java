class Tree
{
    
    int height(Node root) {
        
        if(root==null) {
            return -1;
        }
    return Math.max(height(root.left),height(root.right))+1;
    }
    boolean isBalanced(Node root)
    {
        if(root==null) {
            return true;
        }
        
        
        int bf = height(root.left) - height(root.right);
        boolean ld = isBalanced(root.left);
        boolean rd  = isBalanced(root.right);
        if(ld && rd && bf>=-1 && bf<=1) {
            return true;
        }
        else {
            return false;
        }
    }
}

