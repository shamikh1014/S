
public class HollowSquare{

    static void solidLine(int rows){

        if(rows==0){
            return;
        }

        System.out.print("*");
        solidLine(rows-1);

    }

    static void hollowLine(int col, int rows){

        if(col>rows){
            return;
        }

        if(col==1 || col==rows){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }

        hollowLine(col+1, rows);

    }

    static void printPattern(int currentRow, int rows){

        if(currentRow>rows){
            return;
        }

        if(currentRow==1 || currentRow==rows){
            solidLine(rows);
        }
        else{
            hollowLine(1, rows);
        }

        System.out.println();
        printPattern(currentRow+1, rows);
    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
