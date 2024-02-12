import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class _4SumOfProducts {
    

    // brute force :generate all subsets
    public static int Brute(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        int n=arr.length;
        generate(arr,0,ans,ls,n);

        int sum=0;
        for(List<Integer> a:ans){
            if(a.size()==0){
                continue;
            }
            int product=1;
            for(int x:a){
                product*=x;
            }
            sum+=product;
        }
        return sum;
    }   
    

    public static void generate(int arr[],int ind,List<List<Integer>> ans,List<Integer> ls,int n){
        if(ind==n){
           ans.add(new ArrayList<>(ls));
           return;
        }
        // when i have not considered it in list
        generate(arr, ind+1, ans,ls, n);

        // when i have considered it in list
        ls.add(arr[ind]);
        generate(arr, ind+1, ans,ls, n);
        ls.remove(ls.size()-1);
    }

    // // iterative approach
    public static int SumP(int arr[]){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans=ans+(arr[i]*(ans+1));
        }
        return ans;
    }

    // // recursive approach
    public static int SumR(int arr[],int i){
        if(i==0){
            return arr[i];
        }
        int ans=SumR(arr, i-1);
        return (ans)+arr[i]*(ans+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(SumP(arr));
        System.out.println(SumR(arr,2));

        System.out.println(Brute(arr));
    }

}
