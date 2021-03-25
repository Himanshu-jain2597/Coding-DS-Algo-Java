public class Solution
{
    
    boolean isBSThelper(Node root,int min,int max) {
        if(root==null) {
            return true;
        }
        if(root.data>max||root.data<min) {
            return false;
        } else if(!isBSThelper(root.left,min,root.data-1)) {
            return false;
        } else if(!isBSThelper(root.right,root.data+1,max)) {
            return false;
        } else {
            return true;
        }
    }
    
    
    boolean isBST(Node root)
        {
            
            return isBSThelper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
}
