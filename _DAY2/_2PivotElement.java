// package _DAY2;
// here we are given a rotated sorted array and we need to find the pivot element i.e the largest element .this problem is different from bitonic array since here we dont have increasing -> decresing
// SO we first check if we are in left half or right half 
// 
public class _2PivotElement {
    
    public static int findPivot(int arr[]){
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]<arr[n-1]){
            return n-1;
        }
        if(arr[0]>arr[n-1] && arr[0]>arr[1]){
            return 0;
        }

        int last=arr[n-1];
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]<last){
                h=m-1;
            }
            else{
                if(arr[m]>arr[m+1]){
                    return m;
                }
                l=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a1[]={4,5,6,7,1,2,3};
        int a2[]={1,2,3};
        int a3[]={4,3,2,1};
        int a4[]={1};
        System.out.println(findPivot(a1));
        System.out.println(findPivot(a2));
        System.out.println(findPivot(a3));
        System.out.println(findPivot(a4));
     
    }
}
