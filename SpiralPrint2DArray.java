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
	 int top=0;
	 int bottom = arr.length-1;
	 int left =0;
	 int right = arr[top].length-1;
	 int count =0;
	 int total = (bottom+1)*(right+1);
	 while(count<=total&&top<=bottom&&left<=right) {
	     for(int i=left;i<=right;i++) {
	         System.out.println(arr[top][i]);
	         count++;
	     }
	     top++;
	     for(int i=top;i<=bottom;i++) {
	         System.out.println(arr[i][right]);
	         count++;
	     }
	     right--;
	     for(int i=right;i>=left;i--) {
	         System.out.println(arr[bottom][i]);
	         count++;
	     }
	     bottom--;
	     for(int i=bottom;i>=top;i--) {
	         System.out.println(arr[i][left]);
	         count++;
	     }
	     left++;
	     
	 }
	}
    }
