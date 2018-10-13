package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:00 2018/10/13
 * @Modified By:
 */
public class No63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] res = new int[m][n];
        boolean hasObstacle = false;
        for(int i = 0; i < m; ++i){
            if(hasObstacle) res[i][0] = 0;
            else if(obstacleGrid[i][0] == 1){
                res[i][0] = 0;
                hasObstacle = true;
            }
            else res[i][0] = 1;
        }
        hasObstacle = false;
        for(int j = 0; j < n; ++j){
            if(hasObstacle) res[0][j] = 0;
            else if(obstacleGrid[0][j] == 1) {
                res[0][j] = 0;
                hasObstacle = true;
            }
            else res[0][j] = 1;
        }
        for(int i = 1; i < m; ++i){
            for(int j = 1; j < n; ++j){
                if(obstacleGrid[i][j] == 1) res[i][j] = 0;
                else res[i][j] = res[i-1][j] + res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}
