package com.collection.comparablepkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparabelIMPL {
    public static void main(String[] args) {

        ArrayList al= new ArrayList();
        al.add(new Student(101,"Ajay",32));
        al.add(new Student(102,"lalit",28));
        al.add(new Student(103,"hemant", 29));
        //System.out.printf(String.valueOf(al));

        Collections.sort(al);
        Iterator i1= al.iterator();
        while (i1.hasNext())
        {
           Student st1=(Student)i1.next();
           System.out.println(st1.rollno+"---"+st1.name+"-----"+ st1.age);
        }
    }
}

class  Student implements Comparable
{

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }



    @Override
    public int compareTo(Object o) {

        Student st=(Student) o;
        if(age==st.age){
            return 0;}
        else  if(age< st.age){
            return -1;}
        else {
            return 1;}


    }
}