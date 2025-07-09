
public class Pattern12{

    static void printStar(int start, int cC, int size){

        if(start>size){
            return;
        }

        if(start==cC || start==size || cC==1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }

        printStar(start+1, cC, size);

    }

    static void printPattern(int cR, int size){

        if(cR>size){
            return;
        }

        printStar(1, cR, size);
        System.out.println();
        printPattern(cR+1, size);

    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
