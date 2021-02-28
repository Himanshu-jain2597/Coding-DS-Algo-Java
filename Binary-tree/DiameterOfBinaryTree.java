
// diameter is maximum distance between two node. 

// There are three case possible i.e height of left subtree height of right subtree +2 or max of diamter of left subtree and max of right subtree.

class Solution {
    
    public int height(TreeNode root) {
        
        if(root==null) {
            return -1;
        }
        
        return Math.max(height(root.left),height(root.right))+1;
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null) {
            return 0;
        }
        
        int res = height(root.left) + height(root.right) +2;
        
        
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        
        
        int ans = Math.max(res,Math.max(ld,rd));
        
        return ans;
        
        
        
    }
}
