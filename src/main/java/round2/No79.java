package round2;

public class No79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i =0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(board[i][j] == word.charAt(0)){
                    if(bfs(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }

    private boolean bfs(char[][] board, String word, int row, int col,int pos) {
        if(pos >= word.length()) return true;
        if(row >= board.length || row < 0 || col >= board[0].length || col < 0 || board[row][col] != word.charAt(pos)) return false;
        char tmp = board[row][col];
        board[row][col] = '#';
        boolean res = bfs(board,word,row-1,col,pos+1)
            || bfs(board,word,row+1,col,pos+1)
            || bfs(board,word,row,col-1,pos+1)
            || bfs(board,word,row,col+1,pos+1);
        board[row][col] = tmp;
        return res;
    }
}
