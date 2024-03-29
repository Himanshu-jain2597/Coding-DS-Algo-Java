class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
        while(q1.size()!=0) {
            q2.add(q1.remove());
        }
        
        q1.add(a);
        
        while(q2.size()!=0) {
            q1.add(q2.remove());
        }
        
        
	    // Your code here	
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        int rv = q1.remove();
        return rv;
    }
	
}
