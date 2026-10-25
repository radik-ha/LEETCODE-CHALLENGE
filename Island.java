class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++)
        {
            mark1(grid,i,0,m,n);
            mark1(grid,i,n-1,m,n);
        }
        for(int j=0;j<n;j++)
        {
            mark1(grid,0,j,m,n);
            mark1(grid,m-1,j,m,n);
        }

        int count=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 0)
                {
                    count++;
                    mark1(grid,i,j,m,n);
                }
            }
        }
        return count;
    }

    void mark1(int[][] grid,int i,int j,int m,int n)
    {
        if(i<0 || j<0 || m<=i || n<=j || grid[i][j]==1)
        {
            return;
        }
        grid[i][j] = 1;
        mark1(grid,i,j-1,m,n);
        mark1(grid,i,j+1,m,n);
        mark1(grid,i+1,j,m,n);
        mark1(grid,i-1,j,m,n);
    }
}