package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:11 2018/7/4
 * @Modified By:
 */
public class firstLevel81 {

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] nums1 = {11, 74, 0, 93};
        int[] nums2 = {40, 11, 74, 7};
        int[][] matrix = new int[2][];
        matrix[0] = nums1;
        matrix[1] = nums2;
        System.out.println(isToeplitzMatrix(matrix));
    }
}
