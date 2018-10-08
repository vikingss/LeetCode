package com.viki.leetcode;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 * 示例 1:
 *
 * 给定 matrix = [ [1,2,3], [4,5,6], [7,8,9] ],
 *
 * 原地旋转输入矩阵，使其变为: [ [7,4,1], [8,5,2], [9,6,3] ]
 */
public class firstLevel11 {


    public void rotate(int[][] matrix) {
        //先按对角线反转，再按中轴线反转
        if (matrix == null || matrix.length == 0) {
            return;
        }
        rotateByMid(matrix);
        rotateByLine(matrix);

    }

    private void rotateByMid(int[][] matrix) {
        int length = matrix[0].length;
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < i; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

    }

    private void rotateByLine(int[][] matrix) {
        int length = matrix[0].length;
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length / 2; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][length - j - 1];
                matrix[i][length - j - 1] = tmp;
            }
        }
    }

}
