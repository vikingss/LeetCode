package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:53 2019/1/25
 * @Modified By:
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        //找入口
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(board[i][j] != word.charAt(0)) continue;
                else{
                    if(search(board,i,j,word,0)) return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int startI, int startJ, String word,int pos) {
        if(pos >= word.length()) return true;
        if(startI < 0 || startJ < 0 || startI >= board.length || startJ >= board[0].length
            || word.charAt(pos) != board[startI][startJ]) return false;
        char tmp = board[startI][startJ];
        board[startI][startJ] = '#';//避免走回头路
        boolean isFind = search(board,startI+1,startJ,word,pos+1)
            || search(board,startI,startJ+1,word,pos+1)
            || search(board,startI-1,startJ,word,pos+1)
            || search(board,startI,startJ-1,word,pos+1);
        board[startI][startJ] = tmp;
        return isFind;
    }
}
