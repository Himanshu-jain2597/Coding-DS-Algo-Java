class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null) {
            return false;
        }
       
        return checkPathSum(root,0,targetSum);
        
        
    }
    
    public boolean checkPathSum(TreeNode root,int cs,int sum) {
        
        if(root==null) {
            return false;
        }
        if(root.left==null&&root.right==null) {
            if(cs+root.val==sum){
                return true;
            }
            else {
                return false;
            }
        }
        return checkPathSum(root.left,cs+root.val,sum)||checkPathSum(root.right,cs+root.val,sum);
    }
    
}
