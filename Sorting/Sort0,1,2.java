/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = new int[5];
	    Scanner sc = new Scanner(System.in);
	    for(int i=0;i<5;i++) {
	        arr[i] =  sc.nextInt();
	    }
	    int low=0;
	    int mid=0;
	    int high=4;
	    while(mid<=high) {
	        if(arr[mid]==0) {
	            int temp = arr[low];
	            arr[low] = arr[mid];
	            arr[mid] = temp;
	            low++;
	            mid++;
	        }
	        else if(arr[mid]==1) {
	            mid++;
	        }
	        else {
	            int temp = arr[mid];
	            arr[mid] = arr[high];
	            arr[high] = temp;
	            high--;
	        }
	    }
	    for(int val:arr) {
	        System.out.println(val);
	    }
	    
		// your code goes here
	}
}
