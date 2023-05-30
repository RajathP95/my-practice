import java.util.Arrays;

public class Mergesort {
    public static void merge(int[] arr,int[] aux,int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                aux[k++]=arr[i++];
            }else{
                aux[k++]=arr[j++];
            }
        }
        while(i<=mid){
            aux[k++]=arr[i++];
        }
        for(int l=low;l<=high;l++){
            arr[l]=aux[l];
        }
    }

    public static void mergeSort(int[] arr,int[] aux,int low,int high){
        if (high == low) {
            return;
        }
        int mid=(low+(high-low)/2);

        mergeSort(arr,aux,low,mid);
        mergeSort(arr,aux,mid+1,high);
        merge(arr,aux,low,mid,high);
    }

    public static void main(String[] args){
        int[] arr = {-2,5,4,1,0,2};
        int[] aux = Arrays.copyOf(arr,arr.length);

        mergeSort(arr,aux,0,arr.length-1);
        for(int i:arr) {
            System.out.println(i);
        }
    }


}
