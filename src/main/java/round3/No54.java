package round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:28 2018/10/30
 * @Modified By:
 */
public class No54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resList = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return resList;
        int eRow = matrix.length-1;
        int eCol = matrix[0].length-1;
        int sRow = 0,sCol = 0;
        while(sRow < eRow && sCol < eCol) {
            spiral(resList, matrix, sRow, sCol, eRow, eCol);
            sRow++;
            sCol++;
            eRow--;
            eCol--;
        }
        if(sRow == eRow && sCol < eCol){
            for(int j = sCol; j <= eCol;j++){
                resList.add(matrix[sRow][j]);
            }
        }else if( sCol == eCol && sRow < eRow){
            for(int i = sRow; i <= eRow; ++i){
                resList.add((matrix[i][sCol]));
            }
        }else if(sRow == eRow && sCol == eCol){
            resList.add(matrix[sRow][sCol]);
        }
        return resList;
    }

    private void spiral(List<Integer> resList, int[][] matrix, int sRow, int sCol, int eRow, int eCol) {
        for(int j = sCol; j <= eCol;j++){
            resList.add(matrix[sRow][j]);
        }
        for(int i = sRow+1; i <= eRow; ++i){
            resList.add((matrix[i][eCol]));
        }
        for(int j = eCol-1; j >= sCol; j--){
            resList.add((matrix[eRow][j]));
        }
        for(int i = eRow-1; i > sRow; i--){
            resList.add(matrix[i][sCol]);
        }
    }
}
