// we are given an array and we need to return the closest sum of 3 numbers int the array to the target
import java.util.Arrays;
public class _9prob {
    
    public static int Naive(int arr[],int target){
        int n=arr.length;
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==target){
                        return sum;
                    }
                    int diff=target-sum;
                    if(diff<mindiff){
                        mindiff=diff;
                    }
                }
            }
        }
        return mindiff;
    }
    public static int ThreeClose(int arr[],int target){
        Arrays.sort(arr);
        int n=arr.length;
        int closest=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int left=target-arr[i];
            int l=i+1;
            int h=n-1;
            while(l<h){
                if(arr[l]+arr[h]==target){
                    return target;
                }
                else if(arr[l]+arr[h]<left){
                    if(left-arr[l]+arr[h]<diff){
                        closest=Math.abs(arr[l]+arr[h]+arr[i]);
                    }
                    l++;
                }
                else{
                    if(arr[l]+arr[h]-left<diff){
                        closest=Math.abs(arr[l]+arr[h]+arr[i]);
                    }
                    h--;
                }
            }
        }
        return closest;
    }
    public static void main(String[] args) {
    int arr[]={-1,2,1,-4};
    System.out.println(ThreeClose(arr,1));
    }
}
