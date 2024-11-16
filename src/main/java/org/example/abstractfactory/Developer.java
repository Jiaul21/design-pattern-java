package org.example.abstractfactory;

public class Developer implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Developer salary");
        return 40000;
    }

    @Override
    public String getName() {
        System.out.println("Developer Name");
        return "Developer";
    }
}
