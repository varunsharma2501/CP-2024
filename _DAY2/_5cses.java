// https://cses.fi/problemset/task/1084  link of the question


import java.util.*;
public class _5cses {
    
    public static int appli(int n,int m,int k,int app[],int size[]){
        Arrays.sort(app);
        Arrays.sort(size);
        int i=0,j=0;
        int res=0;
        while(i<n && j<m){
            int req=app[i];
            int lb=app[i]-k;
            int hb=app[i]+k;

            if(size[j]>=lb && size[j]<=hb){
                res++;
                j++;
                i++;
            }
            else if(size[j]<lb){
                j++;
            }
            else if(size[j]>hb){
                i++;
            }
        }
        return res;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int appli[]=new int[n];
        int size[]=new int[m];
        for(int i=0;i<n;i++){
            appli[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            size[i]=sc.nextInt();
        }
       
        System.out.println(appli(n,m,k,appli,size));
        
        
    }
        
    }

