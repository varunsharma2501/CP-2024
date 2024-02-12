import java.util.*;
public class _2StairCase {
    
// here the 2 options are 1 and 2 jump
public static int Stair(int n,int MEM[]){
    
   if(MEM[n]!=-1){
    return MEM[n];
   }
    if(n==1 || n==2 || n==0){
        MEM[n]=n;
        return n;
    }

    MEM[n]=Stair(n-1, MEM)+Stair(n-2,MEM);
    return MEM[n];
}

// here the 3 jumps possible are 1 2 3 
public static int StairFollow(int n,int MEM[]){

    if(MEM[n]!=-1){
        return MEM[n];
    }
    if(n==0 || n==1 || n==2){
        MEM[n]=n;
        return MEM[n];
    }
    if(n==3){
        MEM[n]=4;
        return MEM[n];
    }
    
    MEM[n]=StairFollow(n-1, MEM)+StairFollow(n-2, MEM)+StairFollow(n-3, MEM);
    return MEM[n];
    
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // int MEM[]=new int[n+1];
    // Arrays.fill(MEM,-1);

    // System.out.println(Stair(n,MEM));

    int MEM1[]=new int[n+1];
    Arrays.fill(MEM1,-1);
    for(int i=0;i<=n;i++){
        System.out.println(StairFollow(i,MEM1));
    }
    // System.out.println(StairFollow(n, MEM1));
}

}
