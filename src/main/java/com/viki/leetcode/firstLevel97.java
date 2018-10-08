package com.viki.leetcode;

/**
 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。

 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。

 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。

 返回尽可能高的分数。



 示例：

 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 输出：39
 解释：
 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39


 提示：

 1 <= A.length <= 20
 1 <= A[0].length <= 20
 A[i][j] 是 0 或 1

 返回尽可能高分这个要求，理解为对同一组数，高位尽可能置1，对不同组的相同位尽可能多的置1。

 上述即为本代码的流程：

 1，判断最高位是否为1，否，移动当前行。

 2，判断每列的的0的个数，如果0较多，移动当前列。

 3，输出最高分数。
 */
public class firstLevel97 {
    public static int matrixScore(int[][] A) {
        int row = A.length;
        int column = A[0].length;

        for(int i = 0; i < row; ++i){
            if(A[i][0] == 0){
                for(int j = 0; j < column; ++j){
                    A[i][j] = 1 - A[i][j];
                }
            }
        }

        for(int j = 0; j < column; ++j){
            int zeroCnt = 0,oneCnt = 0;
            for(int i = 0; i < row; ++i){
                if (A[i][j] == 0) {
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
            }
            if(zeroCnt > oneCnt){
                for(int i = 0; i < row; ++i){
                    A[i][j] = 1-A[i][j];
                }
            }

        }
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
//                res += A[i][j] * (Math.pow(2,column - j - 1));
                res += A[i][j] << column - j - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[4];
        matrix[1] = new int[4];
        matrix[2] = new int[4];

        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 1;
        matrix[0][3] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 0;
        matrix[1][2] = 1;
        matrix[1][3] = 0;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 0;
        matrix[2][3] = 0;

        System.out.println(matrixScore(matrix));
    }
}
