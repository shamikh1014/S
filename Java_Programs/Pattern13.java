
public class Pattern13{

    static char ch='A';

    static void printRow(int currentRow, int rows){

        if(currentRow>rows){
            return;
        }

        printCharacter(currentRow);
        ch++;
        System.out.println();
        printRow(currentRow+1, rows);

    }

    static void printCharacter(int n){

        if(n==0){
            return;
        }

        System.out.print(ch);

        printCharacter(n-1);

    }

    public static void main(String[] args){

        printRow(1, 5);
        
    }
    
}
