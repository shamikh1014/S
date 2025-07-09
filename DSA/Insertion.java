
public class Insertion{

    static void bubbleSort(int arr[], int n){

        for(int i=1;i<n;i++){

            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){

                arr[j+1]=arr[j];
                j--;

            }

            arr[j+1]=key;

        }

        
    }

    public static void main(String[] args){

        int array[]={5, 1, 6, 3, 12, 50, 13, 17};
        int n=array.length;

        bubbleSort(array, n);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        
    }
    
}
