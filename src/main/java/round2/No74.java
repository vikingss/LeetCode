package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:01 2018/10/14
 * @Modified By:
 */
public class No74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int i = m-1;
        while(i >= 0){
            if(target < matrix[i][0]) i--;
            else if(target > matrix[i][0]) return binarySearch(matrix[i],target);
            else return true;
        }
        return false;
    }

    private boolean binarySearch(int[] matrix, int target) {
        int l = 0;

    }
}
