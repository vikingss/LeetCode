package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:45 2018/11/6
 * @Modified By:
 */
public class No200 {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        if(grid[0].length == 0) return 0;
        int count = 0;
        for(int i = 0;i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}
