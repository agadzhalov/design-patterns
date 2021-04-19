package com.design.patterns.builder.model;

public class Employee {

    private final int id;
    private final String email;
    private final Name name;
    private final Address address;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
        this.address = builder.address;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder {

        private int id;
        private String email;
        private Name name;
        private Address address;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder name(final Name name) {
            this.name = name;
            return this;
        }

        public Builder address(final Address address) {
            this.address = address;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

}

