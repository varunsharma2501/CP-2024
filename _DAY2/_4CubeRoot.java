public class _4CubeRoot {
    
    public static int cubert(int val){
        
       int l=val<0?-Math.abs(val):0;
       int h=val<0?0:Math.abs(val);
        while(l<=h){
            int m=(l+h)/2;
            if(m*m*m>val){
                h=m-1;
            }
            else{
                if((m+1)*(m+1)*(m+1)>val){
                    return m;
                }
                else{
                    l=m+1;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(cubert(0));
        System.out.println(cubert(27));
        System.out.println(cubert(25));
        System.out.println(cubert(-27));
        System.out.println(cubert(-25));
    }
}
