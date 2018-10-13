package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:14 2018/10/13
 * @Modified By:
 */
public class No64 {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 1; i < m; ++i){
            grid[i][0] +=  grid[i-1][0];
        }
        for(int j = 1; j < n; ++j){
            grid[0][j] += grid[0][j-1];
        }
        for(int i = 1;i < m; ++i){
            for(int j = 1; j < n; ++j){
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
    public static void main(String[] args){
        int[][] grid = new int[3][3];
        grid[0] = new int[]{1,3,1};
        grid[1] = new int[]{1,5,1};
        grid[2] = new int[]{4,2,1};
        System.out.println(minPathSum(grid));
    }
}
