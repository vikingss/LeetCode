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
        if (m == 0 || matrix[0].length == 0) return false;
        int i = m - 1;
        while (i >= 0) {
            if (target < matrix[i][0]) i--;
            else if (target > matrix[i][0]) return binarySearch(matrix[i], target);
            else return true;
        }
        return false;
    }

    private boolean binarySearch(int[] matrix, int target) {
        int l = 0, h = matrix.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (target < matrix[mid]) h = mid;
            else if (target > matrix[mid]) l = mid + 1;
            else return true;
        }
        return false;

    }
}
