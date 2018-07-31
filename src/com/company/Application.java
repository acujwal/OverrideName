package com.company;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Student1 s1 = new Student1(1,"Jhon");
        Student1 s2 = new Student1(2,"ram");
        Student1 s3 = new Student1(1,"Jhon");
        Student1 s4 = new Student1(4,"hari");
        Student1 s5 = new Student1(5,"sham");

        ArrayList<Student1> myStudentList = new ArrayList <>();
        myStudentList.add(s1);
        myStudentList.add(s2);
        myStudentList.add(s3);
        myStudentList.add(s4);
        myStudentList.add(s5);

        for (Student1 s : myStudentList){
            System.out.println(s);

        }

    }


}
