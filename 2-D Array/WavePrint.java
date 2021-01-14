/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [][] arr = takeInput();
		display(arr);
	}
	private static int[][] takeInput() {
	    Scanner sc = new Scanner(System.in);
	    int rows = sc.nextInt();
	    int [][] arr = new int[rows][];
	    for(int i=0;i<rows;i++) {
	        int cols = sc.nextInt();
	        arr[i] = new int[cols];
	        for(int j=0;j<arr[i].length;j++) {
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    return arr;
	}
	private static void display(int[][] arr) {
	    for(int i=0;i<arr.length;i++) {
	        if(i%2==0) {
	        for(int j=0;j<arr[i].length;j++) {
	            System.out.println(arr[i][j]);	        
	        }
	        }
	        else {
	            for(int j=arr[i].length-1;j>=0;j--) {
	                System.out.println(arr[i][j]);
	            }
	        }
	    }
	}
    }
