// here we are given a bitonic array so it will have only 1 peak. We can use binary search here .
// time :O(logn)      space:O(1)

public class _8BitonicPeak {
 
    public static int BitonicPeak(int arr[]){
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        int l=1,h=n-2;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a1[]={1,15,53,66,99,100,50,49,10,2};
        int a2[]={4,1};
        int a3[]={11};
        int a4[]={1,2,3,4};
        int a5[]={1,10,50,40,30,20,5};
        System.out.println(BitonicPeak(a1));
        System.out.println(BitonicPeak(a2));
        System.out.println(BitonicPeak(a3));
        System.out.println(BitonicPeak(a4));
        System.out.println(BitonicPeak(a5));
    }
}
