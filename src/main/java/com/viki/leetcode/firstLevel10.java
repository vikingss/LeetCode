package com.viki.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。 数字 1-9 在每一列只能出现一次。 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 *
 * 上图是一个部分填充的有效的数独。
 *
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 */
public class firstLevel10 {

    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length < 9 || board[0].length < 9)
            return false;
        for(int i =  0; i < 9; i += 3){
            if(!judgeSudoku(board,i,0,3) || !judgeSudoku(board,i,3,3)|| !judgeSudoku(board,i,6,3)){
                return false;
            }
        }
        if(!judgeSudoku(board,0,0,9)){
            return false;
        }
        return true;
    }

    public boolean judgeRow(char[][] board, int startRow, int startColumn,int step) {
        List<Character> tmp = new ArrayList<Character>();
        for (int i = startRow; i < startRow + step; ++i) {
            for (int j = startColumn; j < startColumn + step; ++j) {
                if(board[i][j] >= '1' && board[i][j] <= '9') {
                    if (tmp.contains(board[i][j])) {
                        return false;
                    }
                    tmp.add(board[i][j]);
                }
            }
            tmp = new ArrayList<Character>();
        }
        return true;
    }

    public boolean judgeColumn(char[][] board, int startRow, int startColumn,int step) {
        List<Character> tmp = new ArrayList<Character>();
        for (int j = startColumn; j < startColumn + step; ++j) {
            for (int i = startRow; i < startRow + step; ++i) {
                if(board[i][j] >= '1' && board[i][j] <= '9') {
                    if (tmp.contains(board[i][j])) {
                        return false;
                    }
                    tmp.add(board[i][j]);
                }
            }
            tmp = new ArrayList<Character>();
        }
        return true;
    }

    public boolean judgeSudoku(char[][] board, int startRow, int startColumn,int step) {
        if (judgeRow(board, startRow, startColumn,step) && judgeColumn(board, startRow, startColumn,step)) {
            List<Character> tmp = new ArrayList<Character>();
            for (int i = startRow; i < startRow + step; ++i) {
                for (int j = startColumn; j < startColumn + step; ++j) {
                    if(board[i][j] >= '1' && board[i][j] <= '9') {
                        if (tmp.contains(board[i][j])) {
                            return false;
                        }
                        tmp.add(board[i][j]);
                    }
                }
            }

        }
        return true;
    }

}
