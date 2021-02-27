class GFG
{
	public static boolean find(Node root,int data) {
	    
	    if(root==null) {
	        return  -1;
	    }
	    
	    if(root.data == data)  {
	        return 1;
	    }

	   
	    return find(root.left,data)||find(root.right,data);

	    
	}
}
