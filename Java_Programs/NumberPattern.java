
public class NumberPattern{

    static int a=1;

    static void printNumber(int row){

        if(row==0){
            return;
        }

        System.out.print(a+" ");
        a++;
        printNumber(row-1);

    }

    static void printPattern(int row, int col){

        if(col==0){
            return;
        }

        printNumber(row);

        System.out.println();

        printPattern(row+1, col-1);

    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
