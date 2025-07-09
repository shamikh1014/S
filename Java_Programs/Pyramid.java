
public class Pyramid{

    static void printSpace(int spaceCount){

        if(spaceCount==0){
            return;
        }

        System.out.print("  ");
        printSpace(spaceCount-1);

    }

    static void printStar(int starCount){

        if(starCount==0){
            return;
        }

        System.out.print("* ");
        printStar(starCount-1);

    }

    static void printPattern(int size, int cr){

        if(cr==size){
            return;
        }

        printSpace(size-cr);
        printStar(cr*2-1);

        System.out.println();

        printPattern(size, cr+1);

    }

    public static void main(String[] args){

        printPattern(5, 1);
        
    }
    
}
