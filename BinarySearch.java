// array should be sorted
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
	    binarySearch(arr,elementToSearch);
        
	   
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
	public static void binarySearch(int[] arr,int elementToSearch) {
	    int low = 0;
	    int high = arr.length-1;
	    int mid = (low+high)/2;
	    while(low>high) {
	        if(arr[mid]>elementToSearch) {
	            high = mid-1;
	        }
	        else if(arr[mid]<elementToSearch) {
	            low = mid+1;
	        }
	        else {
	            System.out.println(arr[mid]);
	        }
	    }
	    //System.out.println(-1);
	}
}
