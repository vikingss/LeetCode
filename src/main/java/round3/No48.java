package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:32 2018/10/30
 * @Modified By:
 */
public class No48 {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        if(row == 0) return;
        int col = matrix[0].length;
        if(col == 0) return;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < i; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i = 0; i < row; ++i){
            int k = 0,j = col - 1;
            while(k < j) {
                int tmp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = tmp;
                k++;
                j--;
            }
        }
    }
}
