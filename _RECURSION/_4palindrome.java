// package _RECURSION;

public class _4palindrome {
    
    public static boolean pal(String str,int l,int h){
        if(l>=h){
            return true;
        }

        // check if equal or not
        if(str.charAt(l)!=str.charAt(h)){
            return false;
        }
        return pal(str, l+1, h-1);
        
    }

    public static boolean pali(String str,int l,int N){
        if(l>=N/2){
            return true;
        }

        if(str.charAt(l)!=str.charAt(N-l-1)){
            return false;
        }

        return pali(str, l+1, N);
    }

    public static void main(String[] args) {
        String s1="abcba";
        String s2="abccba";
        String s3="abcd";
        String s4="a";
        System.out.println(pal(s1, 0, 4));
        System.out.println(pal(s2, 0, 5));
        System.out.println(pal(s3, 0, 3));
        System.out.println(pal(s4, 0, 0));
        System.out.println();
        System.out.println(pali(s1, 0, 5));
        System.out.println(pali(s2, 0, 6));
        System.out.println(pali(s3, 0, 4));
        System.out.println(pali(s4, 0, 1));
    }
}
