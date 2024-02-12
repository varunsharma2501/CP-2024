// package _DAY3;
// here we are given n and k we need to find n^k .here k can also be -ve
// time :O(logk)       space:O(logk)

public class _5npowrK {
    
    public static double power(int n,int k){
        if(k==0){
            return 1;
        }
        if(k<0){
            return 1.0/power(n,Math.abs(k));
        }

        double r=power(n, k/2);
        if(k%2==0){
            return r*r;
        }
        else{
            return r*r*n;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(3, 4));
        System.out.println(power(3, 3));
        System.out.println(power(2, -2));
    }
}
