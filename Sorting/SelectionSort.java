// selection sort :- find min element index and put its in right place

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
	    selectionSort(arr);
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
	public static void selectionSort(int[] arr) {
	    for(int i=0;i<arr.length-1;i++) {
	        int min = i;
	        for(int j=i+1;j<arr.length;j++) {
	            if(arr[min]>arr[j]) {
	                min = j;
	            }
	        }
	        int temp = arr[i];
	        arr[i]= arr[min];
	        arr[min] = temp;
	    }
	}
}
