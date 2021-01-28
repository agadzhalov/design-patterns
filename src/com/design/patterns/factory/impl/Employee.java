package com.design.patterns.factory.impl;

public abstract class Employee implements IEmployee {

    private String name;
    private String occupation;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String occupation, int salary) {
        this.name = name;
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
