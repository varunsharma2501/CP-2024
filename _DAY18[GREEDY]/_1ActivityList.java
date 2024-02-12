// package _DAY18;


// here we are given start and end array and we need to return how many activities can be completed by 2 
// persons collectively

// try the same with k persons
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// import com.mysql.cj.xdevapi.Collection;

class PairN{
    int start;
    int end;
    PairN(int s,int e){
        start=s;
        end=e;
    }
}

public class _1ActivityList {

    public static Comparator<PairN> comp=new Comparator<PairN>(){
        public int compare(PairN p1,PairN p2){
            if(p1.end>p2.end){
                return 1;
            }
            else{
                return -1;
            }
        }
    };
    
    public static void main(String[] args) {
        int start[]={1,2,9,6};
        int end[]={5,7,11,12};
        int n=start.length;
        // List<PairN> activity=new ArrayList();
        // for(int i=0;i<n;i++){
        //     activity.add(new PairN(start[i], end[i]));
        // }

        // Collections.sort(activity,comp);

        int pe1=-1;
        int pe2=-1;
        int count=0;
        for(int i=0;i<n;i++){
            int st=start[i];
            if(st>pe1 && st>pe2){
                // assign to one whose end is nearest to start
                count++;
                int m=Math.max(pe1,pe2);
                if(m==pe1){
                    pe1=end[i];
                    System.out.println("pe1 assigned "+start[i]+" -> "+end[i]);
                }
                else{
                    pe2=end[i];
                    System.out.println("pe2 assigned "+start[i]+" -> "+end[i]);
                }
            }
            else if(st>pe1){
                // assigning to pe1 only
                count++;
                pe1=end[i];
                System.out.println("pe1 assigned "+start[i]+" -> "+end[i]);
            }
            else if(st>pe2){
                count++;
                pe2=end[i];
                System.out.println("pe2 assigned "+start[i]+" -> "+end[i]);
            }
            else{
                continue;
            }
        }

        System.out.println();
        System.out.println(count);

    }
}
