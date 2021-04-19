package com.design.patterns.builder;

import com.design.patterns.builder.model.Address;
import com.design.patterns.builder.model.Employee;
import com.design.patterns.builder.model.Name;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Name name = new Name.Builder()
                .firstName("Georgi")
                .middleNames(new ArrayList<>(Arrays.asList("Ivanov", "Malinov")))
                .lastName("Georgiev").build();

        Address address = new Address.Builder()
                                .city("Sofia")
                                .streetName("Moskovska")
                                .streetNumber(3)
                                .postCode("5800").build();

        Employee employee = new Employee.Builder().address(address)
                                                .name(name)
                                                .email("gosho@dev.bg")
                                                .id(1)
                                                .build();

    }

}
