
public class Solidsquare{

    static void printPattern(int currentRow, int rows){

        if(currentRow>rows){
            return;
        }

        printStar(rows);
        System.out.println();
        printPattern(currentRow+1, rows);

    }

    static void printStar(int stars){

        if(stars==0){
            return;
        }

        System.out.print("*");
        printStar(stars-1);

    }

    public static void main(String[] args){

        printPattern(1, 4);
        
    }
}