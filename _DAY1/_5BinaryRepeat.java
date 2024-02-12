//here we are gven a sorted array having duplicate elements and we need to find the first occurence of the index usign binary seach 
// space :O(1)        time :O(logn)
public class _5BinaryRepeat {
    
    public static int firstOcc(int arr[],int key){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>key){
                h=mid-1;
            }
            else if(arr[mid]<key){
                l=mid+1;
            }
            else{
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else {
                    h=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,3,4,5,5,6,6,6,6,10};
        int a2[]={1};
        System.out.println(firstOcc(a1, 0));
        System.out.println(firstOcc(a1, 6));
        System.out.println(firstOcc(a2, 1));
        System.out.println(firstOcc(a2, 0));
    }
}
