/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */



class Codechef
{
    public static class LinkedList {
    
    private class Node {
        int data;
        Node next;
    }
    
    private Node head;
    private Node tail;
    private int size;
    
    public void display() {
        Node temp = this.head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void addLast(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next= null;
        
        if(this.size>= 1) {
            this.tail.next = nn;
        }
        if(this.size==0) {
            this.head = nn;
            this.tail = nn;
            size++;
        }
        else {
            this.tail = nn;
            size++;
        }
        
    }
    
}

	public static void main (String[] args) throws java.lang.Exception
	{
	    LinkedList ll = new LinkedList();
	    ll.addLast(10);
	    ll.addLast(20);
	    ll.display();
	    
		// your code goes here
	}
}
