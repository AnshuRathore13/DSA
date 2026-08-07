class Solution {
    public int totalNQueens(int n) {
        
        char board[][]=new char[n][n];
        queen(board,0);
        return count;
    }
    int count=0;
    
    public void queen(char board[][],int row){
        if(row==board.length){
            count++;
            return;
            
        }

        for(int j=0;j<board.length;j++){
            if(isPossible(board,row,j)){
                board[row][j]='x';
                queen(board,row+1);
                board[row][j]='.';
            }
            
        }
    }

    public boolean isPossible(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='x') return false;
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='x') return false;
        }

        for(int i=row-1,j=col+1;i>=0&&j<=board.length-1;i--,j++){
            if(board[i][j]=='x') return false;
        }

        return true;
    }






}