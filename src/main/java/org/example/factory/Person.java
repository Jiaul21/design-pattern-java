package org.example.factory;

abstract class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public abstract String getName();
    public abstract int getAge();

    abstract void otherService1();
    abstract void otherService2();
    abstract void otherService3();
}
