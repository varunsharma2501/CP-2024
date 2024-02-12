// here we are given 2 strings S And T. 
// S : defines the order in which alphabets need to be sorted so has all unique characters
// T :The string which we need to sort

// import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _6StringSort {
    static int rank[]=new int[27];
    public static Comparator<Character> comp=new Comparator<Character>() {
        public int compare(Character c1,Character c2){
            if(rank[c1-'a']>rank[c2-'a']){
                return 1;
            }
            else{
                return -1;
            }
        }
    };
    public static String StrSort(String S,String T){
        // setting the rank of alphabets according to S
       
        for(int i=0;i<S.length();i++){
            rank[S.charAt(i)-'a']=i+1;
        }
        char ch[]=T.toCharArray();
        List<Character> ls=new ArrayList<>();
        for(char c: ch){
            ls.add(c);
        }

        Collections.sort(ls,comp);
        StringBuilder str=new StringBuilder();
        for(char c: ls){
            str.append(c);
        }

        String res=str.toString();
        return res;
    }
    public static void main(String[] args) {
        String S="xmoa";
        String T="araxom";
        System.out.println(StrSort(S,T));
        
    }
}
