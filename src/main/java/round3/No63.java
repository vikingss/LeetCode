package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:55 2018/10/30
 * @Modified By:
 */
public class No63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        boolean hasOracle = false;
        for(int i = 0; i < m; ++i){
            if(hasOracle) dp[i][0] = 0;
            else if(obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
                hasOracle = true;
            }else dp[i][0] = 1;
        }

        hasOracle = false;
        for(int j = 0; j < n; ++j){
            if(hasOracle) dp[0][j] = 0;
            else if(obstacleGrid[0][j] == 1){
                dp[0][j] = 0;
                hasOracle = true;
            }else dp[0][j] = 1;
        }

        for(int i = 1; i < m; ++i){
            for(int j = 1; j < n; ++j){
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
