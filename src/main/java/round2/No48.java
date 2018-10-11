package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:39 2018/10/10
 * @Modified By:
 */
public class No48 {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        if(row == 0) return;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < i; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < row / 2; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][row-j-1];
                matrix[i][row-j-1] = tmp;
            }
        }
    }
}
