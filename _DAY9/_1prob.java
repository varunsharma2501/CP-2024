// package _DAY9;

// 22 january
// we are given n and we need to print the first n number s which consists of just 1 2 3 

import java.util.LinkedList;
import java.util.Queue;

public class _1prob {
    
    // public static void Naive(int n){
    //     int num=1;
    //     int count=0;
    //     while(true){
    //         if(check(num)){
    //             System.out.println(num);
    //             count++;
    //             if(count==n){
    //                 break;
    //             }
    //         }
    //         num++;
    //     }
    // }


    // time complexity : O(n)
    // space :O(1)  hw to check space complexity
    public static void eff(int n){
        int key=0;
        Queue<Integer> qs=new LinkedList<>();
        int cnt=0;
        qs.add(key);
        while(cnt<=n){
            int k=qs.remove();
            if(k!=0){
                System.out.println(k);
            }
            qs.add(k*10+1);
            qs.add(k*10+2);
            qs.add(k*10+3);
            cnt++;
        }

    }
    public static void main(String[] args) {
        eff(10);
    }
}
