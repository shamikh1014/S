
public class RightArrow{

    static void printPattern(int currentRow, int n){

        if(currentRow==n){
            return;
        }

        printSpace(2*currentRow);
        printStar(n-currentRow);

        printPattern(currentRow+1, n);

        if(currentRow!=n-1){
            printSpace(2*currentRow);
            printStar(n-currentRow);
        }

    }

    static void printSpace(int spaces){

        if(spaces==0){
            return;
        }

        System.out.print(" ");
        printSpace(spaces-1);

    }

    static void printStar(int stars){

        if(stars==0){
            System.out.println();
            return;
        }

        System.out.print("*");
        printStar(stars-1);

    }

    public static void main(String[] args){

        printPattern(0, 7);
        
    }
    
}
