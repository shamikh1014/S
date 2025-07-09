
import java.util.ArrayList;

public class MergeSort{

    static void merge(int arr[], int start, int end){

        int i=start;
        int mid=(start+end)/2;
        int j=mid+1;

        ArrayList<Integer> temp=new ArrayList<>();

        while(i<=mid && j<=end){

            if(arr[i]<=arr[j]){
                temp.add(arr[i++]);
            }
            else{
                temp.add(arr[j++]);
            }

        }

        while(i<=mid){
            temp.add(arr[i++]);
        }

        while(j<=end){
            temp.add(arr[j++]);
        }

        int k=0;
        for(int index=start;index<=end;index++){
            arr[index]=temp.get(k++);
        }

    }


    static void mergeSort(int arr[], int start, int end){

        // Base Case
        if(start>=end){
            return;
        }

        int mid=(start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end);

    }

    public static void main(String[] args){

        int array[]={15, 9, 16, 3, 8};
        int n=array.length;

        mergeSort(array, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        
    }
    
}
