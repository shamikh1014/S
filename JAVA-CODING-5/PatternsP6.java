
//    *****     *****
//   *******   *******
//  ********* *********
//  ****Skillrisers****
//   *****************
//    ***************
//     *************
//      ***********
//       *********
//        *******
//         *****
//          ***
//           *

public class PatternsP6{

    public static void main(String[] args){

        int n=5;

        // Upper Half
        for(int i=3;i<=n;i++){

            for(int j=0;j<n+1-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }

            for(int j=0;j<2*n-(2*i-1);j++){
                System.out.print(" ");
            }

            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }

            System.out.println();

        }

        String name="Skillrisers";

        n=n*2;

        for(int i=1;i<=n;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            if(i==1){

                for(int k=0;k<(n*2-(2*i-1))/2;k++){

                    if(k==n/2-1){
                        System.out.print(name);
                    }
                    else{
                        System.out.print("*");
                    }

                }

            }
            else{

                for(int k=0;k<(n*2-(2*i-1));k++){
                    System.out.print("*");
                }

            }

            System.out.println();

        }
        
    }
    
}
