public class _7MergeSort {
    
    public static int[] Merge(int A[],int B[]){
        int a=A.length;
        int b=B.length;
        int i=0,j=0,k=0;
        int res[]=new int[A.length+B.length];
        while(i<a && j<b){
            if(A[i]>B[j]){
                res[k]=B[j];
                k++;
                j++;
            }
            else{
                res[k]=A[i];
                i++;
                k++;
            }
        }
        while(i<a){
            res[k]=A[i];
            k++;i++;
        }
        while(j<b){
            res[k]=B[j];
            k++;j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int a1[]={10,13,20,35};
        int a2[]={1,7,10,10,15,21,40};
        int res[]=new int[a1.length+a2.length];
        res=Merge(a1,a2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        
    }
}
