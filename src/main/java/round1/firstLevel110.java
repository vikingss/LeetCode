package round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**

 */
public class firstLevel110 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //swap(matrix[i][j],matrix[j][i]);
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < i; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        //swap(matrix[i][j],matrix[i][n - j - 1])
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n / 2; ++j){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }


}
