
public class NQueen{

    static final int N=4;

    // create a Board
    static boolean board[][]=new boolean[N][N];

    static boolean canIPlaceAQueen(int row, int col){

        // Check in Above Row
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }

        // Check in Left Diagonal
        for(int i=row, j=col;i>=0 && j>=0;i--, j--){
            if(board[i][j]){
                return false;
            }
        }

        // Check in Right Diagonal
        for(int i=row, j=col;i>=0 && j<board.length;i--, j++){
            if(board[i][j]){
                return false;
            }
        }

        return true;
    }

    static int countQueenPlacedWays(int row){

        int count=0;

        // Termination Case
        if(row==board.length){
            return 1;
        }

        // Traverse in Cols
        for(int col=0;col<board.length;col++){

            if(canIPlaceAQueen(row, col)){

                // So Place a Queen
                board[row][col]=true;

                // Move to the Next Row
                count=count+countQueenPlacedWays(row+1); // Stack Build

                // Stack Fall+Work=BackTracking
                board[row][col]=false; // Undo the Queen

            }

        }

        return count;

    }

    public static void main(String[] args){

        int count=countQueenPlacedWays(0);
        System.out.println("Count Ways "+count);
        
    }

}