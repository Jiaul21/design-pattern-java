package org.example.abstractfactory;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
