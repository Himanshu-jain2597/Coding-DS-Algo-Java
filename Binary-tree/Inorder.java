class Tree
{
    public static void inOrder(Node node,ArrayList<Integer>list) {
        if(node == null) {
            return;
        }
        
        inOrder(node.left,list);
        list.add(node.data);
        inOrder(node.right,list);
    }
    
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list;
    }
    
    
}
