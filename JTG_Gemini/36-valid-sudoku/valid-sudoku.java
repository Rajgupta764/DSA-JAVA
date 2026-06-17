class Solution {
    public boolean isValidSudoku(char[][] board) {

        //for rows
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                 if(board[i][j]=='.') continue;
                 if(set.contains(board[i][j])) return false;
                 set.add(board[i][j]);
            }
        }
        //for columns
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
        }

        //for boxes
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    int row=(i/3)*3+j;
                    int column=(i%3)*3+k;

                    if(board[row][column]=='.') continue;
                    if(set.contains(board[row][column])) return false;
                    set.add(board[row][column]);
                }
            }
        }
        return true;
    }
}