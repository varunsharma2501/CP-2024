// package _DAY5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _4TwoSum {
    
    // brute force where we are traversing the array for n*n times 
    public static List<List<Integer>>  brute(int arr[],int target){
        List<List<Integer>> ls=new ArrayList<>();
        int n=arr.length;
    
        for(int i=0;i<n-1;i++){ 
            List<Integer> a=new ArrayList<>();
            a.add(i);
            int left=target-arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]==left){
                    a.add(j);
                    ls.add(new ArrayList<Integer>(a));
                    break;
                }
            }
        }
        return ls;
    }

    // Better approach using hashing 
    // time:O(n) and space :O(n)
    public static List<List<Integer>> better(int a[],int target){
        List<List<Integer>> ls=new ArrayList<>();
        int n=a.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int left=target-a[i];
            if(map.containsKey(left)){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(map.get(left));
                ls.add(l);
            }
            else{
                map.put(a[i],i);
            }
        }
        return ls;
    }

    public static List<List<Integer>> optimal(int a[],int target){
        int n=a.length;
        Arrays.sort(a);
        int l=0,h=n-1;
        List<List<Integer>> res=new ArrayList<>();
        while(l<h){
            if(a[l]+a[h]==target){
                List<Integer> ls=new ArrayList<>();
                ls.add(l);ls.add(h);
                res.add(ls);
                l++;h--;
            }
            else if(a[l]+a[h]>target){
                h--;
            }
            else{
                l++;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        List<List<Integer>> res=new ArrayList<>();
        // res=brute(arr, 7);
        // res=better(arr, 7);
        res=optimal(arr, 7);
        for(List<Integer> l:res){
            System.out.println(l);
        }

    }
}
