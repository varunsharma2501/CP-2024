// we are given an array which is sorted and there is only one element whihc is repeated we need to retrun the value of repeating element

public class _10assign {

    public static int repeatVal(int arr[]){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            // check if one left side
            if(arr[m]==m+1){
                if(arr[m+1]==m+1){
                    return arr[m];
                }
                l=m+1;
            }
            // if in right half
            else{
                if(arr[m-1]==m){
                    return arr[m];
                }
                h=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1};
        System.out.println(repeatVal(arr));
    }
}
