import java.util.Arrays;

// here we are given a sorted array A[i] and we have to caculate another arr R[i] using function f(x)=Ax^2+Bx+C. So we need to return the sorted array of R[i];

// Approach 1: we can calculate each value of R[i] adn then sort it 
// time: O(n+nlogn)


public class _8ArrayProb {

    public static int[] Naive(int A[],int a ,int b,int c){
    int n=A.length;
    int res[]=new int[n];
    for(int i=0;i<n;i++){
        int x=A[i];
        res[i]=a*x*x+b*x+c;
    }
    
    Arrays.sort(res);
    return res;
   }

//  In earlier approach we were not using the fact that our graph is sorted.SO we know that in quadratic equation we will get a peak or dip so the elements behind and after the peak are sorted. So after it we can use merging 

  public static int[] Eff(int A[],int a,int b,int c){
    int n=A.length;
    int res[]=new int[n];
    int peak=-b/(2*a);

    // so now we traverse array and first element greater than peak
    int l=0,h=n-1;
    int pi=0;
    while(l<=h){
        int m=(l+h)/2;
        if(A[l]>=peak){
            pi=l;
            h=m-1;
        }
        else{
            l=m+1;
        }
    }

    // now elements from 0->pi-1  and pi->n-1 are to be sorted
    int first=a*A[0]*A[0]+b*A[0]+c;
    int second=a*A[1]*A[1]+b*A[1]+c;
    // Case 1: when the peak element is at top

    if(first<second){
        int i=0;int j=n-1,k=0;
        while(i<pi && j>=pi){
           int x=A[i],y=A[j];
           int xval=a*x*x+b*x+c;
           int yval=a*y*y+b*y+c;
    
           if(xval>yval){
            res[k]=yval;
            k++;
            j--;
           }
           else{
            res[k]=xval;
            k++;
            i++;
           }
    
        }
        while(i<pi){
            int x=A[i];
            int xval=a*x*x+b*x+c;
            res[k]=xval;
            k++;
            i++;
        }
        while(j>=pi){
            int y=A[j];
            int yval=a*y*y+b*y+c;
            res[k]=yval;
            k++;
            j--;
        }
    
    }
    else{
        int i=pi-1;int j=pi,k=0;
        while(i>=0 && j<n){
           int x=A[i],y=A[j];
           int xval=a*x*x+b*x+c;
           int yval=a*y*y+b*y+c;
    
           if(xval>yval){
            res[k]=yval;
            k++;
            j++;
           }
           else{
            res[k]=xval;
            k++;
            i--;
           }
    
        }
        while(i>=0){
            int x=A[i];
            int xval=a*x*x+b*x+c;
            res[k]=xval;
            k++;
            i--;
        }
        while(j<n){
            int y=A[j];
            int yval=a*y*y+b*y+c;
            res[k]=yval;
            k++;
            j++;
        }
    
    }    
    return res;
  } 
   
   public static void main(String[] args) {
    int a1[]={-1,0,1,2,3,4};
    // int r1[]=new int[a1.length];
    // r1=Naive(a1, -1, 2, 1);

    // for(int i=0;i<r1.length;i++){
    //     System.out.print(r1[i]+" ");
    // }

    int r2[]=new int[a1.length];
    r2=Eff(a1,-1,2,1);
         for(int i=0;i<r2.length;i++){
        System.out.print(r2[i]+" ");
    }
   }
}
