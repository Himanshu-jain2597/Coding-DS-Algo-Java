class Solution
{
    void deleteNode(Node del)
    {
         if(del.next!=null||del.next.next!=null) {
             
             del.data = del.next.data;
             del.next = del.next.next;
             
         }
    }
}
