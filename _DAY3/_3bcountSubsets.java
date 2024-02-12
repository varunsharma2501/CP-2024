// it is just an extension of previous question .Now we can have negative as well as 0 as an element. we need to return the count of all such possible subsets
// subsets means they need not be contiguos thats why we can apply recusrion of whether include or exclude any element 

public class _3bcountSubsets {
    
    public static int countSub(int arr[],int current,int ind){
        // termination condition
        if(ind==arr.length){
            if(current==0){
                return 1;
            }
            return 0;
        }

        // when we are selecting the element
        return countSub(arr,current-arr[ind],ind+1)+countSub(arr,current,ind+1);
    }
    public static void main(String[] args) {
        int a1[]={2,3,1,4,5};
        int a2[]={1,2,3,-1,0};
        System.out.println(countSub(a1, 6, 0));
        System.out.println(countSub(a1, 16, 0));
        System.out.println(countSub(a2, 3, 0));
    }
}
