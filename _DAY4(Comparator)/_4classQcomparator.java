// package _DAY4;

// Here we are given a pair of integers <I,J> and we need to sort them such that 
// 1.If I1!=I2 then arrange in ascending order of first
// if they are equal then arrange them in descending order of 2nd

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Pair{
    int first;
    int second;
    Pair(int f,int s){
        first=f;
        second=s;
    }

    public String toString(){
        return first+" , "+second;
    } 
}
public class _4classQcomparator {
    
    public static Comparator<Pair> comp=new Comparator<Pair>(){

        public int compare(Pair p1,Pair p2){
            if(p1.first!=p2.first){
                if(p1.first>p2.first){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else{
                if(p1.second<p2.second){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
    };

    public static void main(String[] args) {
        List<Pair> ls=new ArrayList<>();
        ls.add(new Pair(10,5));
        ls.add(new Pair(1,5));
        ls.add(new Pair(10,2));
        ls.add(new Pair(5, 0));
        ls.add(new Pair(50, 100));
        Collections.sort(ls,comp);

        for(Pair l: ls){
            System.out.println(l);
        }
    }
}
