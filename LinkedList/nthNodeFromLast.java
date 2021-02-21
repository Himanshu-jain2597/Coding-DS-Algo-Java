    int getNthFromLast(Node head, int n)
    {
        
        Node fast  = head;
        Node slow  = head;
        
        int count = 0;
        while(count<n) {
            
            if(fast==null) {
                return -1;
            }
            fast  = fast.next;
            count++;
        }
        if(fast==null) {
            return head.data;
        }
        else {
        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
        }
    	// Your code here	
    	
    }
}
