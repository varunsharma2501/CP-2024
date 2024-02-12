public class _7KSmall2D {
    
    public static int SOE(int arr[][],int m){
       
        int count=0;
        int r=arr.length;
        int c=arr[0].length;
    
        for(int i=0;i<r;i++){
            boolean flag=false;
            for(int j=0;j<c;j++){
                if(arr[i][j]>m){
                    count=count+(j);
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                count+=c;
            }
        }
        return count;
    }

    public static int SOEbin(int arr[][],int m){
         // do binary search in each row
        // complexity is O(logm)*n     where n: rows and m:cols
        int r=arr.length;
        int c=arr[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            // binary search in each row
            int l=0,h=c-1;
            int ind=0;
            while(l<=h){
                int mid=(l+h)/2;
                if(arr[i][mid]>m){
                    h=mid-1;
                }
                else{
                   ind=mid;
                   l=mid+1;
                }
            }
            count+=ind+1;
        }
        return count;
    }

    public static int Ksmall(int arr[][],int k){
        int r=arr.length; 
        int c=arr[0].length;
        // find lowest and highest element O(m+n)
        int l=arr[0][0] ,h=arr[0][0];
        for(int i=0;i<r;i++){
            if(arr[i][0]<l){
                l=arr[i][0];
            }
            if(arr[i][c-1]>h){
                h=arr[i][c-1];
            }
        }

        while(l<=h){
            int m=(l+h)/2;
            int cnt=SOEbin(arr,m);
            if(cnt<k){
                // move to right
                l=m+1;
            }
            else{
                int cnt1=SOEbin(arr,m-1);
                if(cnt1<k){
                    return m;
                }
                else{
                    // move to left
                    h=m-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[][]={{1,3,5},{1,2,9},{4,5,6}};
        System.out.println(Ksmall(arr,4));
        System.out.println(Ksmall(arr,2));
        System.out.println(Ksmall(arr,7));
    }
}
