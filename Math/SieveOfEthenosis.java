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
	    SOE(n);
	}
	public static void SOE(int n) {
	    boolean[] primes =  new boolean[n+1]; // declare an array of boolean for size n+1
	    Arrays.fill(primes,true); // assume that all number are primes .. 
	    primes[0]= false; // 0 and 1 are not prime nor composite. 
	    primes [1] = false;
	    for(int i=2;i*i<=n;i++) {
	        if(primes[i]==true) {
	        for(int mul=2;i*mul<=n;mul++) {
	            primes[i*mul] = false;
	            
	        }
	    }
	    }
	    for(int i=0;i<primes.length;i++) {
	        if(primes[i]) {
	            System.out.println(i);
	        }
	    }
	}
}
