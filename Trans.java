// Problem: Transpose Matrix
// Platform: LeetCode
// Approach: Swap row and column indices
// Time: O(m*n), Space: O(m*n)


import java.util.Arrays;

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
return result;
    }
}

class Trans
{
public static void main(String args[])
{
Solution o = new Solution();
int[][] matrix = {{1,2},{4,7}};
int[][] output = o.transpose(matrix);
for(int[] row:output)
{
System.out.println(Arrays.toString(row));
}
}
}




















