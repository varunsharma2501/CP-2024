// package _DAY2;


public class _3Sqrt {
    public static int sqrt(int val){
        for(int i=1;i<val;i++){
            if(i*i>val){
                return i-1;
            }
        }
        return -1;
    }

    public static int sqrtEff(int val){
        int l=0,h=val;
        while(l<=h){
            int m=(l+h)/2;
            if(m*m>val){
                h=m-1;
            }
            else{
                if((m+1)*(m+1)>val){
                    return m;
                }
                else{
                    l=m+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(25));
        System.out.println(sqrt(29));
        System.out.println();
        System.out.println(sqrtEff(25));
        System.out.println(sqrtEff(1));
        System.out.println(sqrtEff(35));
    }
}
