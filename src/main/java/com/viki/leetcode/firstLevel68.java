package com.viki.leetcode;

/**
 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。

 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。

 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。

 示例 1:

 输入: [[1,1,0],[1,0,1],[0,0,0]]
 输出: [[1,0,0],[0,1,0],[1,1,1]]
 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 示例 2:

 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 说明:

 1 <= A.length = A[0].length <= 20
 0 <= A[i][j] <= 1
 */
public class firstLevel68 {
    public static int[][] flipAndInvertImage(int[][] A) {
        flip(A);
        invert(A);
        return A;
    }

    private static void invert(int[][] a) {
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j <  a[i].length; ++j){
                a[i][j] ^=  1;
            }
        }
    }

    private static void flip(int[][] a) {
        for(int i = 0;i < a.length; ++i){
            int l = 0,h = a[i].length - 1;
            while(l < h){
                int tmp = a[i][l];
                a[i][l] = a[i][h];
                a[i][h] = tmp;
                l++;
                h--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        a[0] = new int[3];
        a[1] = new int[3];
        a[2] = new int[3];
        firstLevel68.flipAndInvertImage(a);
    }
}
