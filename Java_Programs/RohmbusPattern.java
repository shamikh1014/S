
public class RohmbusPattern{

    static void printSpace(int spaceCount){

        if(spaceCount==0){
            return;
        }

        System.out.print(" ");
        printSpace(spaceCount-1);

    }

    static void printStar(int starCount){

        if(starCount==0){
            return;
        }

        System.out.print("*");
        printStar(starCount-1);

    }

    static void printPattern(int cr, int size){

        if(cr==size){
            return;
        }

        printSpace(size-cr);
        printStar(size);

        System.out.println();

        printPattern(cr+1, size);

    }

    public static void main(String[] args){

        printPattern(0, 5);
        
    }
    
}
