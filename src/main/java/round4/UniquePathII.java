package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:37 2019/1/24
 * @Modified By:
 */
public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0 || obstacleGrid[0].length == 0) return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0] == 1) return 0;
        dp[0][0] = 1;
        boolean hasOracle = false;
        for(int i = 0; i < obstacleGrid.length; ++i){
            if(hasOracle) dp[i][0] = 0;
            else{
                if(obstacleGrid[i][0] == 1){
                    hasOracle = true;
                    dp[i][0] = 0;
                }else dp[i][0] = 1;
            }
        }

        hasOracle = false;

        for(int j = 0; j < obstacleGrid[0].length; ++j){
            if(hasOracle) dp[0][j] = 0;
            else{
                if(obstacleGrid[0][j] == 1){
                    hasOracle = true;
                    dp[0][j] = 0;
                }else dp[0][j] = 1;
            }
        }
        for(int i = 1; i < dp.length; ++i){
            for(int j = 1; j < dp[i].length; ++j){
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
