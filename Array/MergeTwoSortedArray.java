/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] arr1 = new int[5];
	    int [] arr2 =  new int[5];
	    Scanner sc = new Scanner(System.in);
	    for(int i=0;i<5;i++) {
	        arr1[i] = sc.nextInt();
	    }
	    for(int i=0;i<5;i++) {
	        arr2[i] = sc.nextInt();
	    }
	    int [] arr = new int[10];
	    int i=0;
	    int j=0;
	    int k=0;
	    while(i<5&&j<5) {
	        
	        if(arr1[i]<=arr2[j]) {
	            arr[k] = arr1[i];
	            i++;
	        }
	        else {
	            arr[k] = arr2[j];
	            j++;
	        }
	        k++;
	        
	    } 
	    while(i<5) {
	        arr[k] = arr1[i];
	        i++;
	        k++;
	    }
	    while(j<5) {
	        arr[k] = arr2[j];
	        j++;
	        k++;
	    }
	    for(int l=0;l<10;l++) {
	        System.out.println(arr[l]);
	    }
		// your code goes here
	}
}
