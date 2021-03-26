package com.design.patterns.factory.impl;

import com.design.patterns.factory.model.Employee;

public class BackendEngineer extends Employee {

    public BackendEngineer() {
        setName("John Doe");
        setOccupation("Java and MySQL");
        setSalary(3400);
    }

    @Override
    public void doWork() {
        System.out.println("Design scalable RESTful APIs with " + getOccupation());
    }
}
