public class _11SelectionSort {
    
    public static void Selection(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int a1[]={10,5,6,3,7,1,9};
        Selection(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
    }
}
