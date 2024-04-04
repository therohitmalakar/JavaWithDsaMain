public class NQueens {

    public static boolean isSafe(char board[][] , int row, int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i=row-1, j=col+1; i>=0 && j< board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void Queen(char board[][], int row){

        if(row == board.length){
//            printBoard(board);
            count++;
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                Queen(board, row+1);
                board[row][j] = 'x';
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args){
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        Queen(board,0);
        System.out.println("total no. of ways queens can be placed:"+count);
    }
}
