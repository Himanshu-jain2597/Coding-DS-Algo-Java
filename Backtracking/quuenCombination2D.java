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
	    queenCombinationBoxRespect2D(new boolean[2][2],0, 0, 0, 2, "");
    }
    
    public static void queenCombinationBoxRespect2D(boolean[][] board,int row,int col,int qpsf,int tq,String ans) {
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
        board[row][col]= true;
        queenCombinationBoxRespect2D(board,row,col+1,qpsf+1,tq,ans+"{"+row+"-"+ col+"}");
        board[row][col] = false;
        queenCombinationBoxRespect2D(board,row,col+1,qpsf,tq,ans);
        
    }
}
