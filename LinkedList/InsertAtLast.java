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
    
    public void InsertAtLast(int data) {
        
        Node nn = new Node(data);
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        
        temp.next = nn;
        nn.next= null;
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
        ll.InsertAtFirst(2);
        ll.display();
        System.out.println();
        ll.InsertAtFirst(3);
        ll.display();
        System.out.println();
        ll.InsertAtLast(5);
        ll.display();
    }
}
