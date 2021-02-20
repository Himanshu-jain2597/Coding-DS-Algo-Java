class LinkedList  {
    
    private Node head;
    
    
   private  class Node {
        int data;
        Node next;
        
        
        // constructor to create a new node 
        Node(int data) {
            
            this.data = data;
            next = null;
            
        }
    }
    
    public void InsertAtFirst(int data) {
        
        
        Node nn = new Node(data);
        
        nn.next = head;
        head = nn;
        
    }
    
    public void InsertAtMiddle(int data,int InsertAt) {
        Node nn =  new Node(data);
        
        int count =0;
        Node temp = head;
        while(count<InsertAt-1) {
            temp = temp.next;
            count++;
        }
        
        if (temp == null)  {  
            System.out.println("The given previous node cannot be null");  
            return;  
        }
        
        nn.next = temp.next;
        temp.next = nn;
        
        
    }
    
    public void InsertAtLast(int data) {
        
         if (head == null) { 
        head = new Node(data); 
        return; 
        } 
        
        Node nn = new Node(data);
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        
        temp.next = nn;
        nn.next= null;
    }
    
    public int getFirstElement() {
        if(head == null) {
            System.out.println("linked list is empty");
            return 0;
        }
        else {
            return this.head.data;
        }
    }
    
    public void display() {
        Node temp  =  head;
        while(temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new  LinkedList();
        int firstfirst = ll.getFirstElement();
        System.out.println(firstfirst);
        ll.InsertAtFirst(2);
        ll.display();
        System.out.println();
        ll.InsertAtFirst(3);
        ll.display();
        System.out.println();
        ll.InsertAtLast(5);
        ll.display();
        System.out.println();
        ll.InsertAtMiddle(6,2);
        ll.display();
        System.out.println();
        int firstLast = ll.getFirstElement();
        System.out.println(firstLast);
    }
}
