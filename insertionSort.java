// insertion sort works on logic consider a scanerio in which if array is already sorted and we want to insert an element in that sorted array. 

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
	    insertionSort(arr);
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
	public static void insertionSort(int[] arr) {
	    for(int i=1;i<arr.length;i++) {
	        int val = arr[i];
	        int j=i-1;
	        while(j>=0&&arr[j]>val) {
	            arr[j+1]= arr[j];
	            j = j-1;
	        }
	        arr[j+1] = val;
	    }
	}
}
