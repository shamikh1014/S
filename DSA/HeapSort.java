
public class HeapSort{

    static void buildHeap(int arr[], int n){

        for(int i=n/2-1;i>=0;i--){
            heapify(arr, n, i);
        }

    }

    static void sort(int arr[]){

        int n=arr.length;
        buildHeap(arr, n);

        for(int i=n-1;i>0;i--){

            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr, i, 0);

        }

    }

    static void heapify(int arr[], int n, int i){

        int largest=i;
        int leftChild=2*i+1;
        int rightChild=2*i+2;

        if(leftChild<n && arr[leftChild]>arr[largest]){
            largest=leftChild;
        }

        if(rightChild<n && arr[rightChild]>arr[largest]){
            largest=rightChild;
        }

        if(largest!=i){

            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr, n, largest);

        }

    }

    public static void main(String[] args){

        int arr[]={12, 10, 13, 4, 6, 8};
        int n=arr.length;

        sort(arr);

        // After Sorting
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        
    }
    
}
