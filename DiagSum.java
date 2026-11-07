class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int sum = 0;
        for(int i=0;i<rows;i++)
        {
            sum = sum + mat[i][i];
            sum = sum + mat[i][rows-1-i];
        }
        if(rows%2 == 1)
        {
            sum = sum - mat[rows/2][rows/2];
        }
        return sum;
    }
}