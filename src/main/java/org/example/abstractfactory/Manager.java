package org.example.abstractfactory;

public class Manager implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Manager salary");
        return 50000;
    }

    @Override
    public String getName() {
        System.out.println("Manager Name");
        return "Manager";
    }
}
