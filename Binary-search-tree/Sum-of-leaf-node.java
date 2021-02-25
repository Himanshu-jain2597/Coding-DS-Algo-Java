class GfG
{
    public int SumofLeafNodes(Node root)
    {
        
        if(root==null) {
            return 0;
        }
        
        if(root.left==null&&root.right==null) {
            return root.data;
        }
        
        int leftSum = SumofLeafNodes(root.left);
        int rightSum = SumofLeafNodes(root.right);
        
        
        return leftSum + rightSum;
        
        // your code here
    }
}
