/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] arr = new int[5];
	    for(int i=0;i<arr.length;i++) {
	        arr[i] =  i+1;
	    }
	    
	    // non working swap 
	    System.out.println(arr[0]+" " + arr[2]);
	    nonWorkingSwap(arr[0],arr[2]);
	    System.out.println(arr[0]+" " + arr[2]);
	    
	    // working swap 
	    System.out.println(arr[0]+" "+arr[2]);
	    workingSwap(arr,0,2);
	    System.out.println(arr[0]+" "+arr[2]);
	    
	    int [] other = {100,200,300}; // initalizing array with hardcoded values
	    System.out.println(arr[0]+" " + other[0]);
	    ponterSwap(arr,other);
	    System.out.println(arr[0]+" " + other[0]);
	    
	}
	public static void nonWorkingSwap(int one,int two) {
	    int temp = one;
	    one = two;
	    two = temp;
	}
	
	public static void workingSwap(int[] arr,int i,int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	public static void ponterSwap(int []arr,int[] other) {
	    int [] temp = arr;
	    arr = other;
	    other = temp;
	}
}
