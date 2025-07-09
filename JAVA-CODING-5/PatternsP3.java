
public class PatternsP3{

    public static void main(String[] args){

        // *********
        //  *******
        //   *****
        //    ***
        //     *

        int rows=5;

        for(int i=1;i<=rows;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<(rows*2-(2*i-1));k++){
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println("====================");

        // *********
        //  *     *
        //   *   *
        //    * *
        //     *


        for(int i=1;i<=rows;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=(rows*2-(2*i-1));k++){

                // i==1-first row
                // k==1-first col
                // k==(rows*2-(2*i-1))-last col

                if(i==1 || k==1 || k==(rows*2-(2*i-1))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println();

        }
        
    }
    
}
