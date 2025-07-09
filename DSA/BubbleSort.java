
public class BubbleSort{

    static void bubbleSort(int arr[], int n){

        boolean flag;

        for(int i=0;i<n;i++){

            flag=false;

            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){

                    // swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=true;

                }

            }

            if(flag==false){
                break;
            }

        }
    }

    public static void main(String[] args){

        int array[]={15, 11, 6, 31, 2, 5, 12};
        int n=array.length;

        bubbleSort(array, n);

        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        
    }
}