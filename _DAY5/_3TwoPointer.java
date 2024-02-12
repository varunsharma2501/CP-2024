// we are given a sorted array. We need to check if there exists (i,j) such that a[i]+a[j]=target
public class _3TwoPointer{
    public static boolean HasTarget(int arr[],int target){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<h){
            if(arr[l]+arr[h]==target){
                return true;
            }
            else if(arr[l]+arr[h]>target){
                h--;
            }
            else{
                l++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5};
     System.out.println(HasTarget(arr,4));   
     System.out.println(HasTarget(arr,5));   
     System.out.println(HasTarget(arr, 10));
    }
}