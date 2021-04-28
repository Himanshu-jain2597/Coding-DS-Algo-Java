class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        
        Node slow = head;
        Node fast = head;
        
        while(true) {
            
            if(slow==null||fast==null||fast.next==null) {
                return;
            }
            
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                break;
            }
            
            
        }
        
        if(slow==head) {
            if(fast.next!=null) {
            while(fast.next!=slow) {
                fast=fast.next;
            }
            fast.next=null;
            }
        }
        else {
            slow=head;
            if(slow.next!=null&&fast.next!=null) {
            while(slow.next!=fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            }
        }
        fast.next=null;
    }
}
