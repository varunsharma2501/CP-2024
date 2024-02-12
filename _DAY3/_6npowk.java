// package _DAY3;

// just an illustration that we can do same code like this and here time:O(log3K)
// it seems like the complexity has decreasde but actually if we keep increasing the base to k then it will just become k times multiplication so binary is the best case

public class _6npowk {
    public static int power(int n,int k){
        if(k==0){
            return 1;
        }

        int r=power(n, k/3);
        if(k%3==0){
            return r*r*n;
        }
        else if(k%3==1){
            return r*r*r*n;
        }
        else {
           return r*r*r*n*n;
        } 
    }
    public static void main(String[] args) {
        System.out.println(power(2, 6));
        System.out.println(power(2, 7));
        System.out.println(power(2, 8));
    }
}
