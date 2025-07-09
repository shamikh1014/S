
public class HollowRohmbus{

    static void printSpace(int spaceCount){

        if(spaceCount==0){
            return;
        }

        System.out.print(" ");
        printSpace(spaceCount-1);

    }

    static void printStar(int starCount, int cr, int size){

        if(starCount==0){
            return;
        }

        if(cr==0 || cr==size-1 || starCount==size || starCount==1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }

        printStar(starCount-1, cr, size);

    }

    static void printPattern(int cr, int size){

        if(cr==size){
            return;
        }

        printSpace(size-cr);
        printStar(size, cr, size);

        System.out.println();

        printPattern(cr+1, size);

    }

    public static void main(String[] args){

        printPattern(0, 5);
        
    }
    
}
