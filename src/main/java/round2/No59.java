package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:08 2018/10/11
 * @Modified By:
 */
public class No59 {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int cur = 1, i = 0, j = n-1;
        while (i < j) {
            cur = circle(res, i, i, j, j, cur);
            i++;
            j--;
        }
        if(i == j){
            res[i][j] = cur;
        }

        return res;
    }

    private int circle(int[][] res, int curRow, int curCol, int endRow, int endCol, int cur) {
        for (int j = curCol; j <= endCol; ++j) {
            res[curRow][j] = cur++;
        }
        for (int i = curRow + 1; i <= endRow; i++) {
            res[i][endCol] = cur++;
        }
        for (int j = endCol - 1; j >= curCol; j--) {
            res[endRow][j] = cur++;
        }
        for (int i = endRow - 1; i > curRow; i--) {
            res[i][curCol] = cur++;
        }
        return cur;
    }
}
