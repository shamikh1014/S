
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

public class PatternsP7{

    public static void main(String[] args){

        int n=5;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=i*2;j<n*2;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }
        
    }
    
}
