
public class Pattern22{

    static void printPattern(int cR, int size){

        if(cR>size){
            return;
        }

        printPlus(1, cR, size);
        System.out.println();
        printPattern(cR+1, size);

    }

    static void printPlus(int start, int cC, int size){

        if(start>size){
            return;
        }

        if(cC==(size/2)+1 || start==(size/2)+1){
            System.out.print("+");
        }
        else{
            System.out.print(" ");
        }

        printPlus(start+1, cC, size);

    }

    public static void main(String[] args){

        printPattern(1, 5);
        
    }
    
}
