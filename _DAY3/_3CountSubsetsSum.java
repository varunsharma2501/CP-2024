// package _DAY3;
// here we are givena  set and a sum . We need to find the number of subsets of the given array which have sum equals to given sum 
// subsets need not be contiguos
// here we assume that there are no -ve elements or 0 


public class _3CountSubsetsSum {

    // time :O(2^n)           space:O(n)
    public static int countSub(int arr[],int current,int ind){
        if(current<0){
            return 0;
        }
        if(current==0){
            return 1;
        }
        if(ind==arr.length){
            return 0;
        }

        // when the element is not included in the sum
        return countSub(arr, current, ind+1)+countSub(arr, current-arr[ind], ind+1);
    }
    public static void main(String[] args) {
        int a1[]={2,3,1,4,5};
        int a2[]={2,2,2};
        System.out.println(countSub(a1, 6, 0));
        System.out.println(countSub(a1, 0, 0));
        System.out.println(countSub(a1, 20, 0));
        System.out.println(countSub(a2, 4, 0));
    }
}
