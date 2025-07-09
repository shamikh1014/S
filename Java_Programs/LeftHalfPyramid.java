
public class LeftHalfPyramid{

    static void printStar(int currentRow){

        if(currentRow==0){
            return;
        }

        System.out.print("*");
        printStar(currentRow-1);

    }

    static void printPattern(int currentRow, int rows){

        if(currentRow>rows){
            return;
        }

        printStar(currentRow);
        System.out.println();
        printPattern(currentRow+1, rows);

    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
