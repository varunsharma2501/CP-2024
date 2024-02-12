// package _DAY4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Student{
    int age;
    String name;

    Student(int x,String n){
        age=x;
        name=n;
    }

    public String toString(){
        return "the name is :"+name +" and age is : "+age;
    }
}

public class _2ComparatorSt {
    
    public static Comparator<Student> comp=new Comparator<Student>() {
        public int compare(Student s1,Student s2){
            if(s1.age==s2.age){
                if(s1.name.charAt(0)>s2.name.charAt(0)){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            else{

                if(s1.age>s2.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
    };
    public static void main(String[] args) {
        List<Student> studs=new ArrayList<>();
        studs.add(new Student(10, "Varun"));
        studs.add(new Student(5, "Sahajdeep"));
        studs.add(new Student(20, "Aman"));
        studs.add(new Student(10, "Heera"));

        Collections.sort(studs,comp);
        for(Student s: studs){
            System.out.println(s);
        }
    }
}
