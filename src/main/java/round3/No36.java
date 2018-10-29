package round3;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:24 2018/10/29
 * @Modified By:
 */
//    观察行号规律：
//
//    第0个九宫格：000111222; 第1个九宫格：000111222; 第2个九宫格：000111222;
//
//    第3个九宫格：333444555; 第4个九宫格：333444555; 第5个九宫格：333444555;
//
//    第6个九宫格：666777888; 第7个九宫格：666777888; 第8个九宫格：666777888;
//
//    可见对于每三个九宫格行号增3；对于单个九宫格，每三个格点行号增1。
//    观察列号规律：
//
//    第0个九宫格：012012012; 第1个九宫格：345345345; 第2个九宫格：678678678;
//
//    第3个九宫格：012012012; 第4个九宫格：345345345; 第5个九宫格：678678678;
//
//    第6个九宫格：012012012; 第7个九宫格：345345345; 第8个九宫格：678678678;
//
//    可见对于下个九宫格列号增3，循环周期为3；对于单个九宫格，每个格点行号增1，周期也为3。
public class No36 {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; ++i){
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            Set<Integer> blockSet = new HashSet<>();
            for(int j = 0; j < 9; ++j){
                if(board[i][j] != '.' && !rowSet.add(board[i][j] - '0')) return false;
                if(board[j][i] != '.' && !colSet.add(board[j][i] - '0')) return false;
                int rowIndex = 3*(i/3)+j/3;
                int columnIndex = 3 * (i%3) + j % 3;
                if(board[rowIndex][columnIndex] != '.' && !blockSet.add(board[rowIndex][columnIndex] - '0'))
                    return false;

            }
        }
        return true;
    }
}
