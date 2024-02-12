// here we are given a 1D array which is unsorted and we need to find the maximum size of subarray for which sum of every possible subarray of that size is always less than given integer x.


public class _8Subarray{
    
    public static boolean SmallThan(int arr[],int x,int m){
        int n=arr.length; 
        int sum=0;
        // calculate first window sum to use sliding window technique
        for(int i=0;i<m;i++){
            sum+=arr[i];
        }
        if(sum>=x){
            return false;
        }
        for(int i=1;i<=n-m;i++){
            sum=sum-arr[i-1]+arr[i+m-1];
            if(sum>=x){
                return false;
            }
        }
        return true;
    }

    //time complexity :O(logn)*O(m)  [m is window size] 
    public static int maxSub(int arr[],int x){
        int n=arr.length;
        int l=1,h=n;
        while(l<=h){
            int m=(l+h)/2;
            if(SmallThan(arr,x,m)){
                if(!SmallThan(arr,x,m+1)){
                    return m;
                }
                else{
                    l=m+1;
                }
            }
            else{
                h=m-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,4};
        int a2[]={10,20,30};
        System.out.println(maxSub(a1, 8));
        System.out.println(maxSub(a2, 6));
    }
}