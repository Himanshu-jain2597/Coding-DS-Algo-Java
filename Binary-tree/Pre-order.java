class BinaryTree
{
    public static void preOrder(Node node,ArrayList<Integer>list) {
        if(node == null) {
            return;
        }
        list.add(node.data);
        preOrder(node.left,list);
        preOrder(node.right,list);
    }
    static ArrayList<Integer> preorder(Node root)
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
        // Code here
    }

}
