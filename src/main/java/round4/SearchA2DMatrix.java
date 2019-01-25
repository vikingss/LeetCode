package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:11 2019/1/25
 * @Modified By:
 */
public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int i = matrix.length - 1;
        while (i >= 0) {
            int j = 0;
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                i--;
            else {
                int l = 0, h = matrix[i].length - 1;
                while (l <= h) {
                    int mid = (l + h) / 2;
                    if (matrix[i][mid] == target)
                        return true;
                    else if (matrix[i][mid] < target)
                        l = mid + 1;
                    else
                        h = mid - 1;
                }
                return false;
            }
        }
        return false;
    }
}