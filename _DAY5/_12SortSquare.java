// given an array of non decreasing integers we need to return the array of squares of them which need to be in non decreasing order
public class _12SortSquare {
    
    public static int[] Sort(int arr[]){
        int n=arr.length;
        int res[]=new int[n];
        int l=0,h=n-1;
        int k=n-1;
        while(l<=h){
            int sql=arr[l]*arr[l];
            int sqh=arr[h]*arr[h];

            if(sql<sqh){
                res[k]=sqh;
                h--;
                k--;
            }
            else{
                res[k]=sql;
                l++;
                k--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-4,-2,-1,1,2,4,4,7};
        int res[]=new int[arr.length];
        res=Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
