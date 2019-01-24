package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:24 2019/1/24
 * @Modified By:
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        matrix(matrix,0,n-1,0,n-1,1);
        return matrix;
    }

    private void matrix(int[][] matrix, int sRow, int eRow, int sCol, int eCol,int num) {
        if(sRow > eRow || sCol > eCol) return;
        for (int j = sCol; j <= eCol; ++j) matrix[sRow][j] = num++;
        for (int i = sRow + 1; i <= eRow; i++) matrix[i][eCol] = num++;
        for (int j = eCol - 1; j >= sRow; j--) matrix[eRow][j] = num++;
        for (int i = eRow - 1; i > sRow; i--) matrix[i][sCol] = num++;

        matrix(matrix,sRow+1,eRow-1,sCol+1,eCol-1,num);


    }
}
