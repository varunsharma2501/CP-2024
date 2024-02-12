// package _DAY5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

// import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
public class _5ThreeSum {
    
    // brute force solution having time: O(N^3)   and space: O(N)
    public static List<List<Integer>> naive(int arr[]){
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> ls=new ArrayList<>();
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[k]);
                        // Collections.sort(ls);
                        if(!res.contains(ls)){
                            res.add(ls);
                        }
                    }
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> better(int arr[]){

        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int req=-(arr[i]+arr[j]);
                if(set.contains(req)){
                    List<Integer> ls=new ArrayList<>();
                    ls.add(arr[i]);
                    ls.add(arr[j]);
                    ls.add(req);
                    if(!ans.contains(ls)){
                        ans.add(ls);
                    }
                }
                else{
                    set.add(arr[j]);
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> eff(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int l=i+1;
            int h=n-1;

            while(l<h){

                if(arr[i]+arr[l]+arr[h]==0){
                    List<Integer> ls=new ArrayList<>();
                    ls.add(arr[i]);
                    ls.add(arr[l]);
                    ls.add(arr[h]);
                    ans.add(ls);
                    l++;
                    h--;
                    while(l<h && arr[l]==arr[l-1]){l++;}
                    while(l<h && arr[h]==arr[h+1]){h--;}
                }
                else if(arr[i]+arr[l]+arr[h]<0){
                    l++;
                }
                else{
                    h--;
                }
                
            }
            
            }

        return ans;
    }
    public static void main(String[] args) {
        int a1[]={-1,-1,-1,2,2,0,0,1,3,-2};
        int a2[]={0,0,0,0};
        List<List<Integer>> ans=new ArrayList<>();
        // ans=naive(a1);
        // ans=better(a1);
        ans=eff(a1);
        for(List<Integer> ls: ans){
            System.out.println(ls);
        }

    }
}
