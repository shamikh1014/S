
public class Pattern11{

    static void printStar(int starCount){

        if(starCount==0){
            return;
        }

        System.out.print("*");
        printStar(starCount-1);

    }

    static void printSpace(int spaceCount){

        if(spaceCount==0){
            return;
        }

        System.out.print(" ");
        printSpace(spaceCount-1);

    }

    static void printPattern(int size, int cR){

        if(cR==size){
            return;
        }

        printSpace(cR);
        printStar(size-cR);

        System.out.println();

        printPattern(size, cR+1);

    }

    public static void main(String[] args){

        printPattern(5, 0);
        
    }
    
}
