
public class LeftHalfInvertedHollowPyramid{

    static void printPattern(int currentRow, int rows){

        if(currentRow<0){
            return;
        }

        if(currentRow==1 || currentRow==rows){
            printSolidLine(currentRow);
        }
        else{
            printHollowLine(1, currentRow);
        }

        System.out.println();
        printPattern(currentRow-1, rows);
    }

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


    public static void main(String[] args){

        printPattern(5, 5);
        
    }
    
}
