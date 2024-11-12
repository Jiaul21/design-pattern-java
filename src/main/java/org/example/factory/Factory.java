package org.example.factory;

public class Factory {
    private Factory(){}

    public static Person getInstance(int id,String name, int age, String role){
        if(role=="STUDENT"){
            return new Student(id,name,age);
        }
        else if(role=="TEACHER"){
            return new Teacher(id,name,age);
        }
        else
            throw new IllegalArgumentException("Role is not valid");
    }
}
