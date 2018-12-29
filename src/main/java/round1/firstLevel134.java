package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:18 2018/8/3
 * @Modified By:
 */
public class firstLevel134 {

//    public static boolean exist(char[][] board, String word) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if (board[i][j] == word.charAt(0)) {
//                    if (helper(i, j, 0, word, board) == true) {
//                        return true;
//                    }
//                }
//            }
//
//        }
//        return false;
//    }
//
//    private static boolean helper(int i, int j, int index, String word, char[][] board) {
//        if (index == word.length()) {
//            return true;
//        }
//        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word
//            .charAt(index)) {
//            return false;
//        }
//        char tmp = board[i][j];
//        board[i][j] = '#';
//
//        boolean rst =
//            helper(i + 1, j, index + 1, word, board) || helper(i, j + 1, index + 1, word, board)
//                || helper(i, j - 1, index + 1, word, board) || helper(i - 1, j, index + 1, word,
//                board);
//
//        board[i][j] = tmp; //回溯，把值赋回去
//        return rst;
//    }

    public static boolean exist(char[][] board, String word) {
        //找第一个值，入口
        for(int i = 0; i < board.length; ++i){
            for(int j = 0; j < board[0].length; ++j){
                if(board[i][j] == word.charAt(0)){
                    if(helper(i,j,0,board,word) == true){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean helper(int i, int j, int index, char[][] board, String word) {
        if(index == word.length()) return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)){
            return false;
        }
        char tmp = board[i][j];//保存回溯入口
        board[i][j] = '#';//前进一步

        boolean rst = helper(i + 1,j,index+1,board,word)
            || helper(i, j + 1,index+1,board,word)
            || helper(i - 1,j,index+1,board,word)
            || helper(i,j - 1, index+1,board,word);
        board[i][j] = tmp;//回退
        return rst;
    }


    public static void main(String[] args) {
        char[][] board = new char[3][4];

        board[0] = new char[]{'A', 'B', 'C', 'E'};
        board[1] = new char[]{'S', 'F', 'C', 'S'};
        board[2] = new char[]{'A', 'D', 'E', 'E'};

        String word = "ABCCED";

        System.out.println(exist(board,word));

    }
}
