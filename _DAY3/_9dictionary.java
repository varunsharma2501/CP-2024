// package _DAY3;

public class _9dictionary {
    
    static int count=0;
    public static void print(String s,int n){
      if(s.length()>3 || count>= n){
        return;
      }

      if(!s.equals("")){
        System.out.println(s);
        count++;;
      }

      print(s+"a",n);
      print(s+"b",n);
      print(s+"c",n);

    }
    public static void main(String[] args) {
        print("",5);
    }

}
