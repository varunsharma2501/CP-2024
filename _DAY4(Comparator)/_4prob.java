// this is the extension of previous code . Here we need to find the count of all the pairs of (i,j) in array where a[i]>2*a[j]
public class _4prob {
    
    public static int count(int a[],int l,int h){
        if(l>=h){
            return 0;
        }
        int ans=0;
        int m=(l+h)/2;
        ans+=retCnt(a,l,m,h);
        ans+=count(a, l, m);
        ans+=count(a,m+1,h);
        return ans;
    }
    public static int retCnt(int a[],int l,int m,int h){
        int i=l;
        int j=m+1;
        int res=0;
        int k=0;

        int temp[]=new int[h-l+1];
        while(i<=m && j<=h){
            if(a[i]>a[j]){
                temp[k]=a[j];
                k++;j++;
            }
            else{
                temp[k]=a[i];
                i++;k++;
            }
        }
        while(i<=m){
            temp[k]=a[i];
            k++;i++;
        }
        while(j<=h){
            temp[k]=a[j];
            k++;j++;
        }

        for(int x=l;x<=h;x++){
            a[x]=temp[x-l];
        }

        int left=l;
        int right=m+1;
        while(left<=m && right<=h){
            while(left<=m && a[left]<2*a[right]){
                left++;
            }
            res+=m-left+1;
            right++;

        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={5,7,1,2,10,3,11};
        System.out.println(count(a,0,6));
    }
}
