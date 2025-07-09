
public class Pattern21{

    static void printStar(int start, int cC, int tC){

        if(start>(2*tC)){

            System.out.println();
            return;

        }

        if(start==cC || start==(2*tC)-cC){
            System.out.print("*");
        }

        else{
            System.out.print(" ");
        }

        printStar(start+1, cC, tC);

    }

    static void printPattern(int cR, int size){

        if(cR>size){
            return;
        }

        printStar(1, cR, size);
        printPattern(cR+1, size);

        if(cR!=size){
            printStar(1, cR, size);
        }

    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
