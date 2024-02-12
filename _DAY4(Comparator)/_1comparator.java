// package _DAY4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
public class _1comparator {
    
    // comparator to sort the numbers based on the last digit
    static Comparator<Integer> com=new Comparator<Integer>(){

        public int compare(Integer i,Integer j){
            // return 1 for swap
            if(i%10>j%10){
                return 1;
            }
            else{
                return -1;
            }
        }
    };

    // comparator to compare strings based on their length
    static Comparator<String> comS=new Comparator<String>(){

        public int compare(String s1,String s2){
            if(s1.length()>s2.length()){
                return 1;
            }
            else{
                return -1;
            }
        }
    };


    public static void main(String[] args) {
        // List<Integer> nums=new ArrayList<>();
        // nums.add(4);
        // nums.add(10);
        // nums.add(1);
        // nums.add(3);

        // Collections.sort(nums);
        // System.out.println(nums);
        // Collections.sort(nums,com);
        // System.out.println(nums);

        List<String> str=new ArrayList<>();
        str.add("Varun");
        str.add("hi");
        str.add("Lpu");
        str.add("professional");
        Collections.sort(str,comS);
        System.out.println(str);


    }
}
