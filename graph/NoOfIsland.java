
class Solution
{
    public int numIslands(char[][] grid)
    {
        int ROW = grid.length;
        int COL = grid[0].length;
        boolean visited[][] = new boolean[ROW][COL];
 
        int count = 0;
        for (int i = 0; i < ROW; ++i)
            for (int j = 0; j < COL; ++j)
                if (grid[i][j] == '1' && !visited[i][j]) 
                { 
                    DFS(grid, i, j, visited);
                    ++count;
                }
 
        return count;
    }
    
    public void DFS(char[][] grid,int row,int col,boolean[][] visited) {
        
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
        visited[row][col] = true;
 
        for (int k = 0; k < 8; ++k)
            if (isItSafe(grid, row + rowNbr[k], col + colNbr[k], visited))
                DFS(grid, row + rowNbr[k], col + colNbr[k], visited);
    }
    
    public boolean isItSafe(char[][] grid,int row,int col,boolean[][] visited) {
        
        return (row >= 0) && (row < grid.length) && (col >= 0) && (col < grid[row].length) && (grid[row][col] == '1' && !visited[row][col]);

    }
}
