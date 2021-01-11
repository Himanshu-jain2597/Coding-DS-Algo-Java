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
        int max = calculateMax(arr);	  
        System.out.println(max);
	   
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
	public static int calculateMax(int[] arr) {
	    int max = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++) {
	        if(arr[i]>max) {
	            max = arr[i];
	        }
	    }
	    return max;
	}
}
