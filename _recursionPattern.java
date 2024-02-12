public class _recursionPattern {
    public static void printPattern(String str,int A,int B,int C){
        if(A+B+C==0){
            // print the string and return ;
            System.out.println(str);
            return;
        }

        if(A>0 && (str.length()==0 || str.charAt(str.length()-1)!='A')){
            // append A to the recursion
            str+='A';
            printPattern(str, A-1, B, C);
            str=str.substring(0, str.length()-1);
        }
        if(B>0 && (str.length()==0 || str.charAt(str.length()-1)!='B')){
            // append A to the recursion
            str+='B';
            printPattern(str, A, B-1, C);
            str=str.substring(0, str.length()-1);
        }
        if(C>0 && (str.length()==0 || str.charAt(str.length()-1)!='C')){
            // append A to the recursion
            str+='C';
            printPattern(str, A, B, C-1);
            str=str.substring(0, str.length()-1);
        }

    }
    public static void main(String[] args) {
        String str="";
        printPattern(str,2,1,2);
    }
}
