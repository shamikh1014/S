
public class Pattern16{

    static void printPattern(int currentRow, int rows){

        if(currentRow>rows){
            return;
        }

        printSpace(rows-currentRow);
        printNum(currentRow, rows);

        System.out.println();

        printPattern(currentRow+1, rows);

    }

    static void printNum(int currentRow, int rows){

        if(currentRow==0){
            return;
        }

        System.out.print(rows-currentRow+1);
        printNum(currentRow-1, rows);

    }

    static void printSpace(int space){

        if(space==0){
            return;
        }

        System.out.print(" ");
        printSpace(space-1);

    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
