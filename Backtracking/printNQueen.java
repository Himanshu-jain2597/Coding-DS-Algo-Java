/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	boolean[][] board = new boolean[4][4];
	printNQueen(board,0,"");
	}
	
	public static void printNQueen(boolean[][]board,int row,String result) {
	    if(row==board.length) {
	        System.out.println(result);
	        return;
	    }
	    int count=0;
	    for(int col=0;col<board[row].length;col++) {
	        if(isitsafe(board,row,col)) {
	            board[row][col] = true;
	            printNQueen(board,row+1,result+"{" + (row+1)+ "," + (col+1)+ "}");
	            board[row][col] = false;
	        }
	    }
	}
	public static boolean isitsafe(boolean board[][],int row,int col) {
	    for(int i=row;i>=0;i--) {
	        if(board[i][col]) {
	            return false;
	        }
	    }
	    for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
	        if(board[i][j]) {
	            return false;
	        }
	    }
	    for(int i=row,j=col;i>=0&&j<board.length;i--,j++) {
	        if(board[i][j]) {
	            return false;
	        }
	    }
	    return true;
	}
}
