package org.example.abstractfactory;

public class Test {
    public static void main(String[] args) {

        Employee employee1= EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(employee1.getName());

        Employee employee2= EmployeeFactory.getEmployee(new DeveloperFactory());
        System.out.println(employee2.getName());
    }
}
