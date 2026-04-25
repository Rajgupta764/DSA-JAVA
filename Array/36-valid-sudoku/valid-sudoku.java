import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // check rows
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                if (set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        // check columns
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') continue;

                if (set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        // check 3x3 boxes
        for (int box = 0; box < 9; box++) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (box / 3) * 3 + i;
                    int col = (box % 3) * 3 + j;

                    if (board[row][col] == '.') continue;

                    if (set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
        }

        return true;
    }
}