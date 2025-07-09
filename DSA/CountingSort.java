
public class CountingSort{

    static void countSort(int arr[], int n){

        // Find max element from array
        int max=arr[0];
        int output[]=new int[n];
        int i;

        for(i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int count[]=new int [max+1];
        for(i=0;i<max;i++){
            count[i]=0;
        }

        for(i=0;i<n;i++){
            count[arr[i]]++;
        }

        // cumulative sum
        for(i=1;i<=max;i++){
            count[i]+=count[i-1];
        }

        for(i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }

        for(i=0;i<n;i++){
            arr[i]=output[i];
        }


    }

    public static void main(String[] args){

        int array[]={15, 9, 16, 3, 8};
        int n=array.length;

        countSort(array, n);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        
    }
    
}
