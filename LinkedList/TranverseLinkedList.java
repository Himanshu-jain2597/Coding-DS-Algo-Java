/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

public class LinkedList {
    
    private class Node {
        int data;
        Node next;
    }
    
    private Node head;
    private Node tail;
    private Node next;
    
    public void display() {
        Node temp = this.head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}
