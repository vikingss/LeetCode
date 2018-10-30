package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:12 2018/10/30
 * @Modified By:
 */
public class No64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        if(n == 0) return 0;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; ++i){
            if(i > 0) {
                dp[i][0] = dp[i-1][0] + grid[i][0];
            }else dp[i][0] = grid[i][0];
        }
        for(int j = 0; j < n; ++j){
            if(j > 0){
                dp[0][j] = dp[0][j-1] + grid[0][j];
            }else dp[0][j] = grid[0][j];
        }
        for(int i = 1; i < m; ++i){
            for(int j = 1; j < n; ++j){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
