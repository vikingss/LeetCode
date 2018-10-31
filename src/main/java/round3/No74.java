package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:55 2018/10/31
 * @Modified By:
 */
public class No74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return false;
        }
        int i = m - 1, j = n - 1;
        while (i >= 0) {
            if (matrix[i][0] > target) i--;
            else if (matrix[i][0] < target) return binarySearch(matrix[i], target);
            else return true;
        }
        return false;
    }

    private boolean binarySearch(int[] matrix, int target) {
        int l = 0, h = matrix.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (target < matrix[mid]) h = mid-1;
            else if (target > matrix[mid]) l = mid + 1;
            else return true;
        }
        return false;
    }
}
