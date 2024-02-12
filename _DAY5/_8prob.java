// we are given a sorted array and we need to return the number of pairs of rectangles which can be formed from it such that area is less than target
import java.util.ArrayList;
import java.util.List;
public class _8prob {
    public static int rec(int a[],int target){
        int n=a.length;
        int count=0;
        int i=0,j=n-1;
        while(i<j){
          
            while(i<j && a[i]*a[j]>=target){
                j--;
            }
            count+=2*(j-i+1)-1;
            i++;
        }
        return count;
    }

    public static List<List<Integer>> recList(int a[],int target){
        int n=a.length;
       List<List<Integer>> res=new ArrayList<>();

        int i=0,j=n-1;
        while(i<j){
          
            while(i<j && a[i]*a[j]>=target){
                j--;
            }
            // printing all the rectnagles
            int start=i,end=j;
            List<Integer> l=new ArrayList<>();
            l.add(a[start]);
            l.add(a[start]);
            res.add(l);
            while(start<end){
                List<Integer> ls=new ArrayList<>();
                ls.add(a[start]);
                ls.add(a[end]);
                List<Integer> lss=new ArrayList<>();
                lss.add(a[end]);
                lss.add(a[start]);
                res.add(new ArrayList<>(ls));
                res.add(new ArrayList<>(lss));
                end--;
            }


            i++;
        }
        return res;
    }
public static void main(String[] args) {
    int a[]={1,2,3,4,5,6};
    System.out.println(rec(a,8));
    List<List<Integer>> ans=new ArrayList<>();
    ans=recList(a, 8);
    for(List<Integer> l:ans){
        System.out.println(l);
    }
}    
}
