
public class DiamondPattern{

    static void printPattern(int cRow, int n){

        if(cRow>n){
            return;
        }

        printSpace(n-cRow);
        printStar(2*cRow-1);

        printPattern(cRow+1, n);

        if(cRow!=n){
            printSpace(n-cRow);
            printStar(2*cRow-1);
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

        printPattern(1, 5);
        
    }
    
}
