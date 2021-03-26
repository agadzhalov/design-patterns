package com.design.patterns.factory;


import com.design.patterns.factory.impl.EmployeeFactory;
import com.design.patterns.factory.model.Employee;

public class Main {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee backendEngineer = employeeFactory.getEmployee("backend");
        System.out.println(backendEngineer.toString());
        backendEngineer.doWork();

        System.out.println("\n");

        Employee frontendEngineer = employeeFactory.getEmployee("frontend");
        System.out.println(frontendEngineer.toString());
        frontendEngineer.doWork();
    }

}
