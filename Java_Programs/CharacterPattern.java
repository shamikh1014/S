
public class CharacterPattern{

    static char ch='A';

    static void printCharacter(int row){

        if(row==0){
            return;
        }

        System.out.print(ch+" ");
        ch++;
        printCharacter(row-1);

    }

    static void printPattern(int row, int col){

        if(col==0){
            return;
        }

        printCharacter(row);

        System.out.println();

        printPattern(row+1, col-1);

    }

    public static void main(String[] args){

        printPattern(1, 4);
        
    }
    
}
