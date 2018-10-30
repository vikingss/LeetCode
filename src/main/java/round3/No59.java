package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:35 2018/10/30
 * @Modified By:
 */
public class No59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int cnt = 1;
        int row = 0,col = 0,eRow = n-1,eCol = n-1;
        while(row < eRow && col < eCol){
            for(int j = col; j <= eCol; ++j){
                res[row][j] = cnt++;
            }
            for(int i = row + 1; i <= eRow; ++i){
                res[i][eCol] = cnt++;
            }
            for(int j = eCol-1; j >= col; j--){
                res[eRow][j] = cnt++;
            }
            for(int i = eRow-1; i > row; i--){
                res[i][col] = cnt++;
            }
            row++;
            col++;
            eRow--;
            eCol--;
        }
        if(row == eRow && col == eCol) res[row][col] = cnt;
        return res;
    }
}
