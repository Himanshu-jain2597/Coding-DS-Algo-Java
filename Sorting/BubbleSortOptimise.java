/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[]  arr = input();
	    display(arr);
	    int elementToSearch = sc.nextInt();
	    bubbleSort(arr);
	    display(arr);
        
	   
	}
	
	public static int[] input() {
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++) {
	        arr[i] = sc.nextInt();
	    }
	    return arr;
	}
	public static void display(int[] arr) {
	    for(int val:arr) {
	        System.out.println(val);
	    }
	}
	public static void bubbleSort(int[] arr) {
	    boolean swap = false;
	   for(int i=0;i<arr.length-1;i++) {
	       for(int j=0;j<arr.length-i-1;j++) {
	           if(arr[j]>arr[j+1]) {
	               int temp = arr[j];
	               arr[j] = arr[j+1];
	               arr[j+1] = temp;
	               swap =true;
	           }
	           
	       }
	       if(swap==false) {
	           break;
	       }
	   }
	}
}
