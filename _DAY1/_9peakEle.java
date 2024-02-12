// here we are given a normal unsorted array and we need to find the peak element.Since there can be more than one peak so we need to return any of the peak element.
public class _9peakEle {
    // time :O(n)         space:O(1) 
    public static int NaivePeak(int arr[]){
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
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }

    // here also it is all same as that of Bitonic but just one more condition we need where we will check the case where mid is the valley element.
    // time :O(logn)       space :O(1)
    public static int BinPeak(int arr[]){
        int n=arr.length;
        if(n==0){return 0;}
        if(arr[0]>arr[1]){return 0;}
        if(arr[n-1]>arr[n-2]){return n-1;}

        int l=1,h=n-2;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]>arr[m+1] && arr[m]>arr[m-1]){
                return m;
            }
            else if(arr[m]>arr[m+1]){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,4};
        int a2[]={5,4,3};
        int a3[]={1,5,2,6,4,7,9};
        System.out.println(NaivePeak(a1));
        System.out.println(NaivePeak(a2));
        System.out.println(NaivePeak(a3));
        System.out.println();
        System.out.println(BinPeak(a1));
        System.out.println(BinPeak(a2));
        System.out.println(BinPeak(a3));
    }
}
