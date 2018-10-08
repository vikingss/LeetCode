package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:01 2018/9/28
 * @Modified By:
 */
public class firstLevel145 {
    public void solve(char[][] board) {
        if(board.length <= 2 || board[0].length <= 2) return;
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; ++i) {
            if(board[i][0] == 'O') dfs(board,i,0);
            if(board[i][col - 1] == 'O') dfs(board,i,col - 1);
        }
        for(int j = 0; j < col; ++j){
            if(board[0][j] == 'O') dfs(board,0,j);
            if(board[row - 1][j] == 'O') dfs(board,row - 1,j);
        }

        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '*') board[i][j] = 'O';
            }
        }

    }

    private void dfs(char[][] board, int i, int j) {
        if(i < 0 || j < 0 || i > board.length || j > board[i].length) return;
        if(board[i][j] == 'X' || board[i][j] == '*') return;
        board[i][j] = '*';
        if(i > 1 && board[i-1][j] == 'O') dfs(board,i-1,j);
        if(j > 1 && board[i][j-1] == 'O') dfs(board,i,j-1);
        if(i < board.length-2 && board[i+1][j] == 'O') dfs(board,i+1,j);
        if(j < board[0].length-2 && board[i][j+1] == 'O') dfs(board,i,j+1);
    }
}
