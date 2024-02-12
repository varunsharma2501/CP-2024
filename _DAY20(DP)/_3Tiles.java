import java.util.Scanner;
import java.util.*;
public class _3Tiles {
    
    public static int Tiles(int n,int MEM[]){
        if(MEM[n]!=-1){
            return MEM[n];
        }
        if(n==0 || n==1 || n==2){
            MEM[n]=n;
            return MEM[n];
        }

        // so now there are 2 cases where we can have first 2 as(1,2) or first 1 as(2,1)
        MEM[n]=MEM[n-1]+MEM[n-2];
        return MEM[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int MEM[]=new int[n+1];
        Arrays.fill(MEM,-1);
        for(int i=1;i<=n;i++){
            System.out.println(Tiles(i,MEM));
        }
    }
}
