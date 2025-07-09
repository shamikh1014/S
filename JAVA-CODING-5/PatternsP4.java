
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

public class PatternsP4{

    public static void main(String[] args){

        int n=5;
        int i, j, k;

        // Upper Half
        for(i=1;i<=n;i++){

            for(j=6;j>i;j--){
                System.out.print("*");
            }

            for(k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }

            for(j=6;j>i;j--){
                System.out.print("*");
            }

            System.out.println();

        }

        // Upper Half
        for(i=1;i<=n;i++){

            for(j=0;j<i;j++){
                System.out.print("*");
            }

            for(k=2*i-2;k<2*n-2;k++){
                System.out.print(" ");
            }

            for(j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();

        }
        
    }
    
}
