/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] arr = new int[n];
	    for(int i=0;i<n;i++) {
	        arr[i] = sc.nextInt();
	    }
	    bubbleSort(arr,0,n-1);
	    for(int i=0;i<n;i++) {
	        System.out.println(arr[i]);
	    }
		// your code goes here
	}
	public static void bubbleSort(int[] arr,int si,int li) {
	    if(li==0) {
	        return;
	    }
	    if(si==li) {
	        bubbleSort(arr,0,li-1);
	       return;
	    }
	    if(arr[si]>arr[si+1]) {
	    int temp = arr[si];
	    arr[si] = arr[si+1];
	    arr[si+1] = temp;
	    }
	    bubbleSort(arr,si+1,li);
	}
}
