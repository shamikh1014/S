
public class Pattern10{

    static void printStar(int cC, int cR, int size){

        if(cC>size){
            return;
        }

        if(cC==size || cR==size || cC==size-cR+1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }

        printStar(cC+1, cR, size);

    }

    static void printSpace(int spaceCount){

        if(spaceCount==0){
            return;
        }

        System.out.print(" ");
        printSpace(spaceCount-1);

    }

    static void printPattern(int cC, int cR, int size){

        if(cR>size){
            return;
        }

        printSpace(size-cR);
        printStar((size-cR+1), cR, size);

        System.out.println();

        printPattern(cC+1, cR+1, size);

    }

    public static void main(String[] args){

        printPattern(1, 1, 10);
        
    }
    
}
