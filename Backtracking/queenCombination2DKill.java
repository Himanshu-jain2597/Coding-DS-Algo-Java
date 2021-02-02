/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int count =0;
	public static void main (String[] args) throws java.lang.Exception
	{
	    queenCombinationBoxRespect2Dill(new boolean[3][4],0, 0, 0, 3, "");
    }
    
    public static void queenCombinationBoxRespect2Dill(boolean[][] board,int row,int col,int qpsf,int tq,String ans) {
        if(qpsf==tq) {
            System.out.println(ans);
            return;
        }
        if(col==board[0].length) {
            row++;
            col=0;
        }
        
        if(row==board.length) {
            return;
        }
        if(isItSafeToPlaceQueen(board,row,col)) {
        board[row][col]= true;
        queenCombinationBoxRespect2Dill(board,row,col+1,qpsf+1,tq,ans+"{"+row+"-"+ col+"}");
        }
        board[row][col] = false;
        queenCombinationBoxRespect2Dill(board,row,col+1,qpsf,tq,ans);
        
    }
    public static boolean isItSafeToPlaceQueen(boolean[][] board,int row,int col) {
        int r = row -1;
        int c = col;
        // vertically upward
        while(r>=0) {
            if(board[r][c]) {
                return false;
            }
            r--;
        }
        // horizontally left
        r= row;
        c =col-1;
        while(c>=0) {
            if(board[r][c]) {
                return false;
            }
            c--;
        }
        // diagnolly left
        r = row-1;
        c = col-1;
        while(r>=0&&c>=0) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        
        // diagnolly right
        r = row-1;
        c = col+1;
        while(r>=0&&c<board[0].length) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
