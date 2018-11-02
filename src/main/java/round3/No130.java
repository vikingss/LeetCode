package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:06 2018/11/2
 * @Modified By:
 */
public class No130 {
    public void solve(char[][] board) {
        if(board.length <= 2 || board[0].length <= 2) return;
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; ++i){
            if(board[i][0] == 'O') bfs(board,i,0);
            if(board[i][col - 1] == 'O') bfs(board,i,col-1);
        }
        for(int j = 0; j < col; ++j){
            if(board[0][j] == 'O') bfs(board,0,j);
            if(board[row-1][j] == 'O') bfs(board,row-1,j);
        }
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }

    private void bfs(char[][] board, int row, int col) {
        if(row < 0||row >= board.length || col < 0 || col >= board[0].length) return;
        if(board[row][col] == '*'  || board[row][col] == 'X') return;
        board[row][col] = '*';
        if(row > 0 && board[row-1][col] == 'O') bfs(board,row-1,col);
        if(col > 0 && board[row][col-1] == 'O') bfs(board,row,col-1);
        if(row < board.length-2 && board[row+1][col] == 'O') bfs(board,row+1,col);
        if(col < board[0].length-2 && board[row][col+1] == 'O') bfs(board,row,col+1);
    }
}
