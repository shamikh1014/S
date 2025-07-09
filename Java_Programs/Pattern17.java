
public class Pattern17{

    static void printPattern(int currentRow, int rows){

        if(currentRow>rows){
            return;
        }

        printSpaces(rows-currentRow);
        printNum(currentRow, rows);

        System.out.println();

        printPattern(currentRow+1, rows);

    }

    static void printNum(int currentCol, int rows){

        if(currentCol==0){
            return;
        }

        System.out.print(rows--);
        printNum(currentCol-1, rows);

    }

    static void printSpaces(int spaces){

        if(spaces==0){
            return;
        }

        System.out.print(" ");
        printSpaces(spaces-1);

    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
