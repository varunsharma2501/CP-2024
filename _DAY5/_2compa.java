// package _DAY5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

class node{
    int val;
    int freq;
    int ind;

    node(int v,int f,int i){
        val=v;
        freq=f;
        ind=i;
    }

    public String toString(){
        return this.freq+" "+this.val+" "+this.ind;
    }

}

public class _2compa{

    static Comparator comp=new Comparator<node>() {

        public int compare(node n1,node n2){
           if(n1.freq!=n2.freq){
               if(n1.freq>n2.freq){
                   return 1;
               }
               else{
                   return -1;
               }
           }
           else{
            if(n1.val!=n2.val){
                if(n1.val>n2.val){
                    return 1;
            }
                else{
                    return -1;
                }
            }
            else{
                if(n1.ind>n2.ind){
                    return 1;
                }
                else{
                    return -1;
                }
            }
           }
        }
    };

    public static void main(String[] args){
        int A[]={2,3,4,1,1,2,1,5,5,7,9,9,9};
        HashMap<Integer,Integer> f=new HashMap<>();
        for(int i: A){
            f.put(i, f.getOrDefault(i, 0)+1);
        }
        List<node> ls=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            ls.add(new node(A[i], f.get(A[i]), i));
        }

        Collections.sort(ls,comp);

        for(node n:ls){
            System.out.println(n);
        }

    }

}
