package com.viki.leetcode;

import java.util.Arrays;

/**
 Given a positive integer n,
 generate a square matrix filled with elements from 1 to n2 in spiral order.

 Example:

 Input: 3
 Output:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class firstLevel114 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int i = 0, j = n-1, x = 1;
        while(i < j){
            x = circle(matrix,i,j,i,j,x);
            i++;
            j--;
        }
        if(i == j){
            matrix[i][j] = x;
        }
        
        return matrix;
    }

    private static int circle(int[][] matrix, int sRow,int eRow,int sCol,int eCol,int x) {

        for(int j = sCol; j <= eCol; ++j){
            matrix[sRow][j] = x++;
        }
        for(int i = sRow + 1; i <= eRow; ++i){
            matrix[i][eCol] = x++;
        }
        for(int j = eCol - 1; j >= sCol; j--){
            matrix[eRow][j] = x++;
        }
        for(int i = eRow - 1; i  > sRow; i--){
            matrix[i][sCol] = x++;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateMatrix(3)));
    }
}
