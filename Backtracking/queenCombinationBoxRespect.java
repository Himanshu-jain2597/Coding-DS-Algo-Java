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
	    queenCombinationBoxRespect(new boolean[4], 0, 0, 2, "");
    }
    
    public static void queenCombinationBoxRespect(boolean[] board,int col,int qpsf,int tq,String ans) {
        if(qpsf==tq) {
            System.out.println(ans);
            return;
        }
        if(col==board.length) {
            return;
        }
        
        board[col]= true;
        queenCombinationBoxRespect(board,col+1,qpsf+1,tq,ans+"b"+col);
        board[col] = false;
        queenCombinationBoxRespect(board,col+1,qpsf,tq,ans);
        
    }
}
