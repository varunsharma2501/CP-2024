import java.util.*;
public class _1triangular{

    public static int Triangular(int n){
        if(n==0){
            return 0;
        }
        return n+Triangular(n-1);
    }


    // done using DP
    public static int TrDP(int n,int mem[]){
        if(mem[n]!=-1){
            return mem[n];
        }

        if(n<2){
            mem[n]=n;
            return mem[n]; 
        }

        mem[n]=TrDP(n-1,mem)+TrDP(n-2,mem);
        return mem[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     System.out.println(Triangular(i));
        // }

        int mem[]=new int[n+1];
        Arrays.fill(mem,-1);
        for(int i=1;i<=n;i++){
            System.out.println(TrDP(i,mem));
        }

    }
}