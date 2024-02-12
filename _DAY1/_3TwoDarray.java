import java.util.Arrays;
public class _3TwoDarray {
 
    public static int MaxBoxes(int arr[][],int x[],int y[]){
        for(int row[]:arr){
            Arrays.fill(row,0);
        }
        int minx=Integer.MAX_VALUE,miny=Integer.MAX_VALUE;
        for(int i=0;i<x.length;i++){
            if(x[i]<minx){
                minx=x[i];
            }
            if(y[i]<miny){
                miny=y[i];
            }
        }
        return (minx+1)*(miny+1);
    }
    public static void main(String[] args) {
        int a1[][]=new int[5][5];
        int x1[]={1,2,3};
        int y1[]={2,3,1};
        System.out.println(MaxBoxes(a1, x1, y1));
    }
}
