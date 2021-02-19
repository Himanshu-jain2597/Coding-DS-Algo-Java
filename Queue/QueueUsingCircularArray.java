



public class CircularArrayQueue {
    private int[] arr;
    private int cs;   // current size
    private int ms;   // maximum size
    private int front;
    private int rear;
    
    public static int DEFAULT_CAPACITY = 10;
    
    CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
        
    }
    
    CircularArrayQueue(int capacity) {
        arr = new int[capacity];
        this.cs =0;
        this.ms = capacity;
        this.front = 0;
        this.rear = capacity - 1;
        
    }
    
    public boolean isFull() {
        return this.cs == this.ms;
    }
    
    public boolean isEmpty() {
        return this.cs ==0;
    }
    
    public void enqueue(int data) {
        if(!this.isFull()) {
            this.rear = (this.rear+1)%arr.length;
            this.arr[this.rear] = data;
            this.cs = this.cs + 1;
        }
        
    }

    public void dequeue() {
        if(!this.isEmpty()) {
            this.front  = (this.front +1)%arr.length;
            this.cs = this.cs -1;
        }
    }

    public int getFront() {
        return this.arr[this.front];
    }

 public static void main (String[] args) {
    
    CircularArrayQueue queue = new CircularArrayQueue();
    for (int i=0;i<=6 ;i++) {
        queue.enqueue(i);
    } 
    
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(8);
    while(!queue.isEmpty()) {
        System.out.println(queue.getFront());
        queue.dequeue();
    }
    
  
}
}
