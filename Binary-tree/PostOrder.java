class Tree
{
    public static void postOrder(Node node,ArrayList<Integer>list) {
        if(node == null) {
            return;
        }
        
        postOrder(node.left,list);
        postOrder(node.right,list);
        list.add(node.data);
    }
    
    
    ArrayList<Integer> postOrder(Node root)
    {
    
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    
       // Your code goes here
    }
}
