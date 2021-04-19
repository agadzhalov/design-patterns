package com.design.patterns.builder.model;

public class Address {

    private final String city;
    private final String streetName;
    private final int streetNumber;
    private final String postCode;

    private Address(Builder builder) {
        this.city = builder.city;
        this.streetName = builder.streetName;
        this.streetNumber = builder.streetNumber;
        this.postCode = builder.postCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public static class Builder {
        private String city;
        private String streetName;
        private int streetNumber;
        private String postCode;

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Builder streetName(final String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder streetNumber(final int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder postCode(final String postCode) {
            this.postCode = postCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

}
