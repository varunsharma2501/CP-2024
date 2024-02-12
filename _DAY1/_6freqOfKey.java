// here we are given a sprted array and we are given a key we need to fidn the frequency of given key in the array.
// so we used binary search to find first and last occurence and then return the diffeernce as answer
// time: O(n)         space:O(1)

public class _6freqOfKey {
    
    public static int freqKey(int arr[],int key){
        int n=arr.length;
        int lowest=LowInd(arr,key);
        int highest=HighInd(arr,key);
        if(lowest==-1 || highest==-1){
            return 0;
        }
        return highest-lowest+1;
    }
    public static int LowInd(int arr[],int k){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]>k){
                h=m-1;
            }
            else if(arr[m]<k){
                l=m+1;
            }
            else{
                if(m==0 || arr[m-1]!=k){
                    return m;
                }
                else{
                    h=m-1;
                }
            }
        }
        return -1;
    }

    public static int HighInd(int arr[],int k){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]>k){
                h=m-1;
            }
            else if(arr[m]<k){
                l=m+1;
            }
            else{
                if(m==n-1 || arr[m+1]!=k){
                    return m;
                }
                else{
                    l=m+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5,5,5,6,7,7,8};
        int a2[]={1,2};
        int a3[]={1};
        System.out.println(freqKey(arr, 5));
        System.out.println(freqKey(a2, 1));
        System.out.println(freqKey(a2, 0));
        System.out.println(freqKey(a3, 1));
        System.out.println(freqKey(a3, 0));
    }
}
