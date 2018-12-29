package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:39 2018/7/17
 * @Modified By:
 */
public class firstLevel115 {

    public static int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            matrix[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix[m - 1][n - 1];
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) {
            return 0;
        }
        int n = obstacleGrid[0].length;
        int[][] matrix = new int[m][n];
        int pos = -1;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                pos = i;
                break;
            } else {
                matrix[i][0] = 1;
            }
        }
        if (pos != -1) {
            for (int i = pos; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        pos = -1;
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                pos = j;
                break;
            } else {
                matrix[0][j] = 1;
            }
        }
        if (pos != -1) {
            for (int j = pos; j < n; ++j) {
                matrix[0][j] = 0;
            }
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                }
            }
        }
        return matrix[m - 1][n - 1];
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;
        int[][] matrix = new int[m][n];
        matrix[0][0] = grid[0][0];
        for (int j = 1; j < n; ++j) {
            matrix[0][j] = grid[0][j] + matrix[0][j - 1];
        }
        for (int i = 1; i < m; ++i) {
            matrix[i][0] = grid[i][0] + matrix[i - 1][0];
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                matrix[i][j] = Math.min(matrix[i - 1][j], matrix[i][j - 1]) + grid[i][j];
            }
        }
        return matrix[m - 1][n - 1];
    }


    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        nums[0][0] = 1;
        nums[0][1] = 3;
        nums[0][2] = 1;
        nums[1][0] = 1;
        nums[1][1] = 5;
        nums[1][2] = 1;
        nums[2][0] = 4;
        nums[2][1] = 2;
        nums[2][2] = 1;
        System.out.println(minPathSum(nums));
    }
}
