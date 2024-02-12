// package _DAY2;

public class _1sorted2Darr {
    
//time :O(log(m*n))            space: O(1) 
public static void findKey(int arr[][],int key){
    int r=arr.length;
    int c=arr[0].length;
    int l=0,h=r*c-1;

    while(l<=h){
        int m=(l+h)/2;
        int x=m/c;
        int y=m%c;    
        if(arr[x][y]==key){
            System.out.println("X coordinate :"+x);
            System.out.println("Y coordinate :"+y);
            return ;
        }
        else if(arr[x][y]<key){
            l=m+1;
        }
        else{
            h=m-1;
        }
    }
    System.out.println("Element not present in this array");
    }

    public static void find2(int arr[][],int key){
        int r=arr.length;
        int c=arr[0].length;

        // binary search to find first element of last column having value>key
        int lc=0,hc=r-1;
        int row=0;
        while(lc<=hc){
            int mid=(lc+hc)/2;
            if(arr[mid][c-1]==key){
                System.out.println("X coordinates are :"+mid);
                System.out.println("Y coordinates are :"+(c-1));
                return;
            }
            else if(arr[mid][c-1]<key){
                lc=mid+1;
            }
            else{
                if(mid==0){
                    System.out.println("Element not present ");
                    return;
                }
                if(arr[mid-1][c-1]<key){
                    row=mid;
                    break;
                }
                else{
                    hc=mid-1;
                }
            }
        }

        int lr=0,hr=c-1;
        while(lr<=hr){
            int m=(lr+hr)/2;
            if(arr[row][m]==key){
                System.out.println("X coordinate :"+row);
                System.out.println("Y coordinate :"+m);
                return;
            }
            else if(arr[row][m]>key){
                hr=m-1;
            }
            else{
                lr=m+1;
            }
        }

        System.out.println("Element not found ");
    }

    public static void main(String[] args) {
    int arr[][]={{10,15,25},{27,30,35},{40,45,50}};
        findKey(arr, 0);
        System.out.println();
        findKey(arr, 30);
        System.out.println();
        findKey(arr,35);
        System.out.println();
        System.out.println();


        find2(arr, 0);
        System.out.println();
        find2(arr, 30);
        System.out.println();
        find2(arr, 35);
        System.out.println();
}
}