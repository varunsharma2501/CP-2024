// package _DAY5;

// we are given an array of +ve -ve and 0 as values .We need to mpdify it such that all the 0 go to the rightmost

public class _1prob {

    public static void Modify(int a[]){
        int n=a.length;
        int l=0,h=n-1;

        while(l<=h){
            while(l<=n-1 && a[l]!=0){
                l++;
                if(l>h){
                    return;
                }
            }
            while(h>=0 && a[h]==0){
                h--;
                if(l>h){
                    return;
                }
            }
    
            // swap 
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
    
        }

    }
    public static void main(String[] args) {
        int a[]={-1,0,3,5,0,2,11,90};
        Modify(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
