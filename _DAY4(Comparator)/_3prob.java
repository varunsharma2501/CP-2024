// 2 pointer approach 
// here we are given 2 arrays and we need to print the count of elements in array1 which are greater than twice the value of elements in array2
public class _3prob {
    
    public static int count(int a1[],int a2[]){

        int n=a1.length;
        int m=a2.length;
        int i=0,j=0;
        int res=0;
        while(i<n && j<m){

            while(i<n && a1[i]<2*a2[j]){
                i++;
            }
            res+=n-i;
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int a1[]={2,4,5,6,8,10};
        int a2[]={1,2,3,4};
        System.out.println(count(a1, a2));

    }
}
