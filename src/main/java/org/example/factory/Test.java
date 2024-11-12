package org.example.factory;

public class Test {
    public static void main(String[] args) {

        Person p1=Factory.getInstance(1,"riyad",24,"STUDENT");
        Person p2=Factory.getInstance(1,"jiaul",24,"TEACHER");

        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());
    }
}
