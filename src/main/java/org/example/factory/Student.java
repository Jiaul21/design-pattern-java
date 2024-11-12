package org.example.factory;

public class Student extends Person{

    private int id;

    Student(int id,String name,int age){
        super(name, age);
        this.id=id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    @Override
    public String getName() {
        return null;
    }
    @Override
    public int getAge() {
        return 0;
    }

    @Override
    void otherService1() {

    }

    @Override
    void otherService2() {

    }

    @Override
    void otherService3() {

    }
}
