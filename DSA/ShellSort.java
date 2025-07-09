
public class ShellSort{

    static void shellSort(int arr[], int n){

        for(int gap=n/2;gap>0;gap/=2){

            for(int i=gap;i<n;i++){

                int temp=arr[i];
                int j=i;

                while(j>=gap && arr[j-gap]>temp){

                    arr[j]=arr[j-gap];
                    j-=gap;
                    
                }
                arr[j]=temp;
            }
        }
    }

    public static void main(String[] args){

        int array[]={5, 1, 6, 3, 12, 22, 14, 19};
        int n=array.length;

        shellSort(array, n);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        
    }
    
}
