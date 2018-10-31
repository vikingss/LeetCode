package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:18 2018/10/31
 * @Modified By:
 */
public class No79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        //find start
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(board[i][j] == word.charAt(0)){
                    if(find(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, String word, int startRow, int startCol,int pos) {
        if(pos >= word.length()) return true;
        if(startRow >= board.length || startRow < 0 || startCol >= board[0].length || startCol < 0 || board[startRow][startCol] != word.charAt(pos)) return false;
        char tmp = board[startRow][startCol];
        board[startRow][startCol] = '#'; //避免搜回头路
        boolean isFind = find(board,word,startRow+1,startCol,pos + 1)
            || find(board,word,startRow,startCol+1,pos + 1)
            || find(board,word,startRow,startCol-1,pos + 1)
            || find(board,word,startRow-1,startCol,pos + 1);
        board[startRow][startCol] = tmp;
        return isFind;
    }
}
