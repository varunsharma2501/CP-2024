public class _10inversion {
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return inverseRec(a,0,n-1);
    }

    public static int inverseRec(int A[],int l,int h){
        if(l==h){
            return 0;
        }

        int m=(l+h)/2;
        int count=0;
        count+=inverseRec(A, l, m);
        count+=inverseRec(A, m+1, h);

        count+=inverseCnt(A,l,m,h);
        return count;
    }

    public static int inverseCnt(int A[],int l,int m,int h){
        int i=l,j=m+1,k=0;
        int temp[]=new int[h-l+1];
        int count=0;
        while(i<=m && j<=h){
            if(A[i]>A[j]){
                temp[k]=A[j];
                count+=m-i+1;
                k++;j++;
            }
            else{
                temp[k]=A[i];
                k++;i++;
            }
        }
        while(i<=m){
            temp[k]=A[i];
            k++;i++;
        }
        while(j<=h){
            temp[k]=A[j];
            k++;j++;
        }

        for(int x=l;x<=h;x++){
            A[x]=temp[x-l];
        }
        
        return count;
    }
}