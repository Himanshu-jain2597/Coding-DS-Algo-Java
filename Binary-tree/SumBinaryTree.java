
class BinaryTree
{
    static int sumBT(Node head){
        
        if(head==null) {
            return 0;
            
        }
        
        int sum = 0;
        sum+= sumBT(head.left) + sumBT(head.right) + head.data;
        return sum;
        
    }
}
