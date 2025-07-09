
public class LeftHalfInvertedPyramid{

    static void printRow(int row){

        if(row==0){
            return;
        }

        printStar(row);
        System.out.println();
        printRow(row-1);

    }

    static void printStar(int stars){

        if(stars==0){
            return;
        }

        System.out.print("*");
        printStar(stars-1);

    }

    public static void main(String[] args){

        printRow(5);
        
    }
    
}
