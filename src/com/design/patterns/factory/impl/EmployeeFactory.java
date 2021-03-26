package com.design.patterns.factory.impl;

import com.design.patterns.factory.model.Employee;

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
