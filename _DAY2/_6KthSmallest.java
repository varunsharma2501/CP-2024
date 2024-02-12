// here we are given an unsorted array and integer k . We need to find the kth smallest integer in an array

/*One approach is to sort the array in O(nlogn) and then return the (k-1) index 
    time :O(nlogn)         space:O(1)
*/

/*Another approach is to apply binary search here */
/*here we are given conditions for this question
 * This is  a read only array  i.e cant sort
 * no extra space included
*/

/**********************Important question on binary search *****************************8 */
public class _6KthSmallest {

    // O(n)
    public static int SmallOrEqual(int arr[],int m){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=m){
                res++;
            }
        }
        return res;
    }

    // time complexity : O(n)+O(log(max-min)*n)   ==> O(n*log(max-min))
    public static int ksmall(int arr[],int k){
        int n=arr.length;
        int l=arr[0],h=arr[0];
        // O(n)
        for(int i=1;i<n;i++){
            if(arr[i]>h){
                h=arr[i];
            }
            if(arr[i]<l){
                l=arr[i];
            }
        }

        // O(log(max-min))
        while(l<=h){
            int m=(l+h)/2;
            int cnt=SmallOrEqual(arr,m);

            if(cnt<k){
                // move to right side
                l=m+1;
            }
            else{
                int cnt1=SmallOrEqual(arr,m-1);
                if(cnt1<k){
                    return m;
                }
                else{
                    h=m-1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int arr[]={1,4,2,3,3,4,4,4,5,5,6};
    int a1[]={5,5,1,2};
    System.out.println(ksmall(arr, 6));
    System.out.println(ksmall(a1, 5));
}    
}
