package com.company;

import com.company.factory.AbstractFactory;

import java.util.Optional;

import static com.company.factory.FactoryProvider.getFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory animalFactory = getFactory("Animal");
        AbstractFactory colorFactory =  getFactory("Color");


        Optional.ofNullable(animalFactory.create("D")).ifPresent(System.out::println);
        Optional.ofNullable(colorFactory.create("W")).ifPresent(System.out::println);

    }
}
