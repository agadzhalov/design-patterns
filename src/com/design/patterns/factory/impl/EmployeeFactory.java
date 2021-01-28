package com.design.patterns.factory.impl;

public class EmployeeFactory {

    public Employee getEmployee(String employee) {
        if (employee.equals(null)) return null;

        if (employee.equalsIgnoreCase("backend")) {
            return new BackendEngineer();
        } else if (employee.equalsIgnoreCase("frontend")) {
            return new FrontendEngineer();
        }
        return null;
    }

}
