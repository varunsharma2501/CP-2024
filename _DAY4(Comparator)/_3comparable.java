// package _DAY4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int x,String n){
        age=x;
        name=n;
    }

    public String toString(){
        return "Name is : "+name +" and age is : "+age;
    }

    public int compareTo(Student s1){
        if(this.age==s1.age){
            if(this.name.charAt(0)>s1.name.charAt(0)){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            if(this.age>s1.age){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
}
public class _3comparable {    

    public static void main(String[] args) {
       List<Student> ls=new ArrayList<>(); 
       ls.add(new Student(10, "Varun"));
       ls.add(new Student(20,"Sahaj"));
       ls.add(new Student(5, "Aman"));
       ls.add(new Student(10, "Akshan"));
       Collections.sort(ls);
       for(Student s: ls){
        System.out.println(s);
       }
    }
}
