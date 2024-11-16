package org.example.abstractfactory;

public class DeveloperFactory implements EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Developer();
    }
}
