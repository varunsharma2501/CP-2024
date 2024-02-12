// code for merge sort

public class _9MergeSort {
    
    public static void mergeSort(int arr[],int l,int h){
        if(l==h){
            return;
        }        

        int mid=(l+h)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr,l,mid,h);
    }

    public static void merge(int arr[],int l,int m,int h){
        int left=l;
        int right=m+1;
        int k=0;
        int temp[]=new int[h-l+1];
        while(left<=m && right<=h){
            if(arr[left]>arr[right]){
                temp[k]=arr[right];
                k++;
                right++;
            }   
            else{
                temp[k]=arr[left];
                k++;
                left++;
            }
        }

        while(left<=m){
            temp[k]=arr[left];
            k++;
            left++;
        }
        while(right<=h){
            temp[k]=arr[right];
            k++;
            right++;
        }

        for(int i=l;i<=h;i++){
            arr[i]=temp[i-l];
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,1,5,2,10,9,15};
        mergeSort(arr, 0, 7);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
