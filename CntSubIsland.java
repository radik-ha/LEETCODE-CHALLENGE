class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid2[i][j]==1)
                {
                    if(dfs(grid1,grid2,i,j,m,n))
                    count++;
                }
            }
        }
        return count;
    }

    private boolean dfs(int[][] grid1,int[][] grid2,int r,int c,int m,int n)
    {
        if(r<0 || c<0 || r>=m || c>=n || grid2[r][c] == 0)
        {
            return true;
        }
        boolean valid = (grid1[r][c]==1);
        grid2[r][c] = 0;
        
        boolean right = dfs(grid1,grid2,r,c+1,m,n);
        boolean left = dfs(grid1,grid2,r,c-1,m,n);
        boolean down = dfs(grid1,grid2,r+1,c,m,n);
        boolean up = dfs(grid1,grid2,r-1,c,m,n);
        return valid && right && up && down &&left;
    }
}