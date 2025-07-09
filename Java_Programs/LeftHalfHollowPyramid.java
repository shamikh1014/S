
public class LeftHalfHollowPyramid{

    static void printSolidLine(int stars){

        if(stars==0){
            return;
        }

        System.out.print("*");
        printSolidLine(stars-1);

    }

    static void printHollowLine(int col, int currentRow){

        if(col>currentRow){
            return;
        }

        if(col==1 || col==currentRow){
            System.out.print("*");
        }

        else{
            System.out.print(" ");
        }

        printHollowLine(col+1, currentRow);

    }

    static void printRow(int currentRow, int rows){
        
        if(currentRow>rows){
            return;
        }

        if(currentRow==1 || currentRow==rows){
            printSolidLine(currentRow);
        }
        else{
            printHollowLine(1, currentRow);
        }

        System.out.println();
        printRow(currentRow+1, rows);

    }

    public static void main(String[] args){

        printRow(1, 5);
        
    }
    
}
