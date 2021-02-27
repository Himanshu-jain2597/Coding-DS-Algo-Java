//Complete the findMax and findMin functions.
class GFG
{
	public static int findMax(Node root) {
	    
	    if(root==null) {
	        return  Integer.MIN_VALUE;
	    }

	    
	   int ls  =  findMax(root.left);
	   int rs =  findMax(root.right);
	   
	   return Math.max(root.data,Math.max(ls,rs));

	    
	}

	public static int findMin(Node root) {
	    
	    if(root==null) {
	        return Integer.MAX_VALUE;
	    }

	    
	   int ls  =  findMin(root.left);
	   int rs =  findMin(root.right);
	   
	   return Math.min(root.data,Math.min(ls,rs));


	}
}
