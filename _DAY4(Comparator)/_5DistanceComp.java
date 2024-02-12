import java.util.List;
import java.util.ArrayList;
// import java.util.Comparable;
import java.util.Collections;


// here in this code we are given a list of coordinates and we need to sort them such that they are in increading order of the distance form origin

class coord implements Comparable<coord>{
    int x;
    int y;

    coord(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "( "+x+" , "+y+" )"+"   and dist is "+this.dist();
    }
    public int dist(){
        return x*x+y*y;
    }

    public int compareTo(coord p){
            if(this.dist()!=p.dist()){
                if(this.dist()>p.dist()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else{
                if(this.x>p.x){
                    return 1;
                }
                else{
                    return -1;
                }
            }
    }

}

public class _5DistanceComp{
    public static void main(String[] args) {
        List<coord> ls=new ArrayList<coord>();
        ls.add(new coord(1,5));
        ls.add(new coord(-1,5));
        ls.add(new coord(2,3));
        ls.add(new coord(0,-5));
        ls.add(new coord(1,1));

        Collections.sort(ls);
        for(coord c: ls){
            System.out.println(c);
        }
    }
}