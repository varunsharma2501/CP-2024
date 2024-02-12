// package _RECURSION;

public class _2factorial {
    
    public static int fac(int N){
        if(N<=1){
            return 1;
        }
        return N*fac(N-1);
    }
    public static void fact(int N,int f){
        if(N==1){
            System.out.println(f);
            return;
        }
        fact(N-1,f*N);
    }
    public static void main(String[] args) {
        System.out.println(fac(5) );
        fact(5, 1);
    }
}
