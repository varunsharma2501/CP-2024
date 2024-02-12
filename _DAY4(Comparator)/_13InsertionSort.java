public class _13InsertionSort {
    
    public static void Insertion(int arr[]){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                }
                // else{
                //     break;
                // }
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int a1[]={10,7,9,14,2,1,20};
        int a2[]={1,2,3,4,5};
        int a3[]={5,4,3,2,1};

        Insertion(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
    }
}
