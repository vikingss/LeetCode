package round1;

import java.util.HashSet;
import java.util.Set;

/**
 Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

 Each row must contain the digits 1-9 without repetition.
 Each column must contain the digits 1-9 without repetition.
 Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */
public class firstLevel129 {
    public boolean isValidSudoku(char[][] board) {
        //use hashset
        for(int i = 0; i < 9; ++i) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> column = new HashSet<>();
            Set<Integer> block = new HashSet<>();
            for(int j = 0; j < 9; ++j){
                if(board[i][j] != '.' && !row.add(board[i][j] - '0')) return false;
                if(board[j][i] != '.' && !column.add(board[j][i] - '0')) return false;
                int rowIndex = 3 * (i / 3) + j / 3;
                int columnIndex = 3 * (i % 3) + j % 3;
                if(board[rowIndex][columnIndex]!='.' && !block.add(board[rowIndex][columnIndex] - '0'))
                    return false;
            }
        }
        return true;
    }
}
