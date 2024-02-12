// here in this question we are given a array of +ve integers(0 or -ve not). The elements can be repeated any number of times. We need to find possible number of combinations where sum will be equal to given number

public class _4SubsetSum{
    
    // time :O(max horizontal val)^n                space:O(n)
    public static int countSub(int arr[],int current,int ind){
      
        if(ind==arr.length){
            if(current==0){
                return 1;
            }
            return 0;
        }
        
        int ans=0;
        for(int i=0;i<=current/arr[ind];i++){
            ans+=countSub(arr, current-arr[ind]*i, ind+1);
        }
        return ans;
    }


    public static void printSub(int arr[],int current,int ind,int temp[],int cnt){
        if(ind==arr.length){
            if(current==0){
                // print the subarray
                for(int i=0;i<cnt;i++){
                    System.out.print(temp[i]);
                }
                System.out.print(" | ");
                return;
            }
            return;
        }

        for(int i=0;i<=current/arr[ind];i++){
            for(int j=0;j<i;j++){
                temp[cnt+j]=arr[ind];
            }
            printSub(arr, current-arr[ind]*i, ind+1,temp,cnt+i);
        }

    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(countSub(arr, 6, 0));
        System.out.println();
        printSub(arr, 6, 0, new int[6], 0);
    }
}
