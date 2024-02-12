public class _12BubbleSort {
    
    // optimizing it i.e when there is 0 swaps then we need to stop the loop
    public static void Bubble(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    // swap them
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=false;
                }
            }

            if(flag==true){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a1[]={10,5,6,3,7,1,9};
        int a2[]={1,2,3,4,5};
        int a3[]={5,4,3,2,1};
        Bubble(a3);
        for(int i=0;i<a3.length;i++){
            System.out.print(a3[i]+" ");
        }
    }
}
