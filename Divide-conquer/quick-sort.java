// quick sort works an algorithim that element on the left sie of the pivot should be less then pivot and element on the right side of the pivot should be greater then pivot.. 


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
	   quickSort(arr,0,n-1);
	   for(int val:arr) {
	       System.out.println(val);
	   }
	}
	public static void quickSort(int [] arr,int low,int high) {
	    if(low>=high) {
            return;
	    } 
	    int left = low;
	    int right = high;
	    int mid =  (low+high)/2;
	    int pivot = arr[mid];
	    while(left<=right) {
	        while(arr[left]<pivot) {
	            left++;
	        }
	        while(pivot<arr[right]) {
	            right--;
	        }
	        if(left<=right) {
	            int temp= arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left++;
	            right--;
	        }
	        
	    }
	   quickSort(arr,low,right);
	   quickSort(arr,left,high);
	}
	
}
