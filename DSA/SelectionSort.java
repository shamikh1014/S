
public class SelectionSort{

    static void selectionSort(int arr[], int n){

        for(int i=0;i<n;i++){
            int min=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }

            // swapping
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }

    public static void main(String[] args){

        int array[]={5, 1, 6, 3};
        int n=array.length;

        selectionSort(array, n);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        
    }
    
}
