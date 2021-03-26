package com.design.patterns.factory.impl;

import com.design.patterns.factory.model.Employee;

public class FrontendEngineer extends Employee {

    public FrontendEngineer() {
        setName("Lorem Ipsum");
        setOccupation("React and bootstrap");
        setSalary(4999);
    }

    @Override
    public void doWork() {
        System.out.println("Implementing visual elements with " + getOccupation());
    }

}
