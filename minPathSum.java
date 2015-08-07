public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        
        for(int i = m; i >= 0; i--){
            for(int j = n; j >= 0; j--){
                if(i < m && j < n){
                    grid[i][j] = Math.min(grid[i+1][j], grid[i][j+1]) + grid[i][j];
                }else if(i < m){
                    grid[i][j] = grid[i+1][j] + grid[i][j];
                }else if(j < n){
                    grid[i][j] = grid[i][j+1] + grid[i][j];
                }
            }
        }
        
        return grid[0][0];
    }
}
