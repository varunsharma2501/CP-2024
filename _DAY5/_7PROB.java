// we are given 2 strings S and T .We need to return the minimum length of substtig of S which covers all the characters of T(including duplicates);
// S: a d o b e c o d e b a n c
// T: a b c 

public class _7PROB{
    
    public static int StrVal(String S,String T){
        int min=Integer.MAX_VALUE;
        int s=S.length();
        int t=T.length();
        int distT=0;

        int sfreq[]=new int[256];
        int tfreq[]=new int[256];

        // for(int i=0;i<S.length();i++){
        //     sfreq[S.charAt(i)]++;
        // }

        for(int i=0;i<T.length();i++){
            if(tfreq[T.charAt(i)]==0){
                tfreq[T.charAt(i)]=1;
                distT++;
            }
            tfreq[T.charAt(i)]++;
        }

        int p1=0,p2=0;
        int count=0;

        // defined the first window
        while(count<distT){
            
            if(sfreq[S.charAt(p2)]==0 && tfreq[S.charAt(p2)]>0){
                count++;
            }
            sfreq[S.charAt(p2)]++;
            p2++;
        }
        min=p2-p1+1;

        // make the sliding window
        while(p2<s){

            while(p1<=p2 && sfreq[S.charAt(p2)]>1 && tfreq[S.charAt(p2)]>=1){
                sfreq[S.charAt(p2)]--;
                p2++;
            } 

            if(p2-p1+1<min){
                min=p2-p1+1;
            }
            
            while(p2<S.length()){
                p2++;
                sfreq[S.charAt(p2)]++;
            }

        }
        while(p1<s && count>=distT){
            sfreq[S.charAt(p1)]--;
            if(sfreq[S.charAt(p1)]==0 && tfreq[S.charAt(p1)]>0){
                count--;
                p1++;
                while(count<distT){
                    p2++;
                    if(sfreq[S.charAt(p2)]==0 && tfreq[S.charAt(p2)]>0){
                        count++;
                        sfreq[S.charAt(p2)]++;
                    }
                }
                min=p2-p1+1;
            }
        }
        return min;


    }
    public static void main(String[] args) {
            
        }
}