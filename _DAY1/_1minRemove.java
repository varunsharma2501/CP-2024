public class _1minRemove{
    
    public static int minRemove(int arr[]){
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        int res=Math.min(even, odd);
        return res;
    }
    public static void main(String[] args) {
        int a1[]={2,4,1,6,3,8};
        int a2[]={1,2,3,4,5,6};
        System.out.println(minRemove(a1));
        System.out.println(minRemove(a2));
    }
    
}