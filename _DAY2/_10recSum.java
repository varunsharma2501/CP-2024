// code to find sum of array using recursion
// time complexity :O(2*n) i.e O(n)        space:O(length of tree) i.e O(log2n)
public class _10recSum {
   
    public static int recSum(int arr[],int l,int h){
        if(l==h){
            return arr[l];
        }
        int m=(l+h)/2;
        return recSum(arr, l, m)+recSum(arr, m+1, h);

    }
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int a2[]={10};
        int a3[]={1,2,3,4,5,6};
        System.out.println(recSum(a1, 0, 4));
        System.out.println(recSum(a2, 0, 0));
        System.out.println(recSum(a3, 0, 5));
    }
}
