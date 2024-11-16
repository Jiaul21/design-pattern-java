package org.example.adapter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();


        CollegeStudent collegeStudent=new CollegeStudent(1,"c_std1","abc");
        SchoolStudent schoolStudent=new SchoolStudent(10,"s_std","xyz");

        students.add(collegeStudent);
//        students.add(schoolStudent);// compile time error
        StudentAdapter studentAdapter=new StudentAdapter(schoolStudent);

        students.add(studentAdapter);   // now it accept schoolStudent object through adapter
    }
}
