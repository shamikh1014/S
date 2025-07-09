
public class QuickSort{

    static int partition(int array[], int low, int high){

        int pivot=array[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(array[j]<=pivot){

                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;

            }

        }

        // swapping pivot element
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;

        return i+1;


    }


    static void quickSort(int array[], int low, int high){

        // Base Case
        if(low<high){

            // pivot element index
            int partitionIndex=partition(array, low, high);
            quickSort(array, low, partitionIndex-1);
            quickSort(array, partitionIndex+1, high);

        }

    }

    public static void main(String[] args){

        int array[]={15, 9, 16, 3, 8};
        int n=array.length;

        quickSort(array, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        
    }
    
}
