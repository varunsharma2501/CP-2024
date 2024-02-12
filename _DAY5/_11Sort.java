// /we are given an array of 1s and 0s and we need to sort them using 2 pointer approach
public class _11Sort {
    
    public static void Sort(int arr[]){
        int n=arr.length;
        int l=0,h=n-1;

        while(l<h){
            if(arr[l]==1 && arr[h]==0){
                // swap them 
                arr[l]=0;
                arr[h]=1;
                l++;h--;
            }
            else if(arr[l]==0){
                l++;
            }
            else{
                h--;
            }
        }
    }

    public static void SortEven(int arr[]){
        int n=arr.length;
        int l=0,h=n-1;

        while(l<h){
            if(arr[l]%2==1 && arr[h]%2==0){
                // swap them 
                int temp=arr[l];
                arr[l]=arr[h];
                arr[h]=temp;
            }
            else if(arr[l]%2==0){
                l++;
            }
            else{
                h--;
            }
        }
    }
    public static void main(String[] args) {
        // int arr[]={1,0,1,0,0,1,1,1,0,1,1};
        // Sort(arr);
    int a2[]={11,2,3,1,5,7,6,8,10};
    SortEven(a2);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]+" ");
        }
    }
}
