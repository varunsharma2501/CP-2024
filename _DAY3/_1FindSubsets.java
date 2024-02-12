// this is the code to print all the subsets of a given set .

// time complexity: no of calls it makes [2^n + 2^n-1 + ..................+1] i.e O(2^n)
// space complexity : maximum length of tree  O(n)
public class _1FindSubsets {
    
    public static void FindSub(int arr[],int temp[],int ind,int cnt){
        // termination condition
        if(ind==arr.length){
            // print the temp array
            for(int j=0;j<cnt;j++){
                System.out.print(temp[j]);
            }
            System.out.print(" | " );
            return;
        }

        // if yes condition 
        temp[cnt]=arr[ind];
        FindSub(arr, temp, ind+1, cnt+1);

        // if no condition
        FindSub(arr,temp,ind+1,cnt);
    }
    public static void main(String[] args) {
        int a1[]={1,2,3};
        int a2[]={1};
        FindSub(a1,new int[a1.length],0,0);
        System.out.println();
        System.out.println();
        FindSub(a2,new int[a2.length],0,0);
    }
}
