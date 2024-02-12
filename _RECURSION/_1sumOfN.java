// package _RECURSION;

public class _1sumOfN {
    
    public static int sum(int N){
        if(N==0){
            return 0;
        }
        return N+sum(N-1);
    }

    public static void sum1(int N,int sum){
        if(N==0){
            System.out.println(sum);
            return;
        }
        sum1(N-1,sum+N);
    }
    public static void main(String[] args) {
        System.out.println(sum(3));
        sum1(5, 0);
    }
}
