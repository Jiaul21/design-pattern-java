package org.example.abstractfactory;

public class ManagerFactory implements EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
