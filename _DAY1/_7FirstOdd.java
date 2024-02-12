// here we are given an ordered array where first are even elements and then are odd elements.We need to return the index of first odd number 
// time :O(logn)    space:O(1)

public class _7FirstOdd {  
    public static int firstOdd(int arr[]){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]%2==0){
                l=m+1;
            }
            else{
                if(m==0 || arr[m-1]%2==0){
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
        int a1[]={2,4,6,0,11,3,5,7};
        int a2[]={11,13};
        int a3[]={2,4,6,1};
        int a4[]={2,4};
        System.out.println(firstOdd(a1));
        System.out.println(firstOdd(a2));
        System.out.println(firstOdd(a3));
        System.out.println(firstOdd(a4));
    }
}
