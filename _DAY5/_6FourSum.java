// package _DAY5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

// import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
public class _6FourSum {
    
    // naive approach having time:O(n^4)
    public static List<List<Integer>> brute(int arr[],int target){
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        int sum=arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum==target){
                            List<Integer> ls=new ArrayList<>();
                            ls.add(arr[i]);
                            ls.add(arr[j]);
                            ls.add(arr[k]);
                            ls.add(arr[l]);
                            Collections.sort(ls);
                            if(!ans.contains(ls)){
                                ans.add(ls);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    // better approach using hashmap
    public static List<List<Integer>> better(int arr[],int target){
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                HashSet<Integer> set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int req=target-(arr[i]+arr[j]+arr[k]);
                    if(set.contains(req)){
                        List<Integer> ls=new ArrayList<>();
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[k]);
                        ls.add(req);
                        Collections.sort(ls);
                        if(!ans.contains(ls)){
                            ans.add(ls);
                        }
                    }
                    else{
                        set.add(arr[k]);
                    }
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> eff(int arr[],int target){
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            while(i>0 && arr[i]==arr[i-1]){i++;}
            for(int j=i+1;j<n-1;j++){
                while(j!=i+1 && arr[j]==arr[j-1]){j++;}
                int left=j+1;
                int right=n-1;

                while(left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum>target){
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        List<Integer> ls=new ArrayList<>();
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[left]);
                        ls.add(arr[right]);
                        ans.add(ls);
                        right--;left++;
                        while(left<right && arr[left]==arr[left-1]){left++;}
                        while(left<right && arr[right]==arr[right+1]){right--;}
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={6,1,2,3,5,1,6,7,8,9,3,0};
        List<List<Integer>> ans=new ArrayList<>();
        // ans=brute(arr, 9);
        // ans=better(arr, 9);
        ans=eff(arr, 9);
        for(List<Integer> a:ans){
            System.out.println(a);
        }
    }
}
