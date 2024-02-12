public class _2BitCost {
    
    public static int MinCost(String s,int start,int end){
        if(s.charAt(end)==s.charAt(start)){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
       String str="0100110010";
        System.out.println(MinCost(str, 2, 8));
        System.out.println(MinCost(str, 0, 2 ));
    }
}
